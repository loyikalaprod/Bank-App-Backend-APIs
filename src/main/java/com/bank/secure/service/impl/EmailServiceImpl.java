package com.bank.secure.service.impl;

import com.bank.secure.dto.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Implémentation du service d'envoi d'email.
 */
@Service
public class EmailServiceImpl implements EmailService {

    // Injection automatique du JavaMailSender pour envoyer des emails.
    @Autowired
    private JavaMailSender javaMailSender;

    // Récupération de l'adresse email de l'expéditeur depuis les propriétés de configuration.
    @Value("${spring.mail.username}")
    private String senderEmail;

    /**
     * Méthode pour envoyer un email d'alerte.
     * @param emailDetails Objet contenant les détails de l'email à envoyer.
     */
    @Override
    public void sendEmailAlert(EmailDetails emailDetails) {
        try {
            // Création d'un objet SimpleMailMessage pour configurer le mail.
            SimpleMailMessage mailMessage = new SimpleMailMessage();

            // Définition des paramètres de l'email.
            mailMessage.setFrom(senderEmail); // Expéditeur
            mailMessage.setTo(emailDetails.getRecipient()); // Destinataire
            mailMessage.setText(emailDetails.getMessageBody()); // Corps du message
            mailMessage.setSubject(emailDetails.getSubject()); // Sujet du mail

            // Envoi du mail via le JavaMailSender.
            javaMailSender.send(mailMessage);

            System.out.println("Mail envoyé avec succès!");
        } catch (MailException e) {
            // Capture des exceptions liées à l'envoi du mail et levée d'une exception générique.
            throw new RuntimeException("Erreur lors de l'envoi de l'email", e);
        }
    }
}
