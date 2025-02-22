package com.bank.secure.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailDetails {

    @Schema(description = "Adresse e-mail du destinataire")
    private String recipient;

    @Schema(description = "Contenu du message de l'e-mail")
    private String messageBody;

    @Schema(description = "Objet de l'e-mail")
    private String subject;

    @Schema(description = "Pièce jointe associée à l'e-mail")
    private String attachment;
}
