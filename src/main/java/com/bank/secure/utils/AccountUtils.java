package com.bank.secure.utils;

import java.time.Year;

/**
 * 1.  la creation d'un numero de compte par generation aleatoire : generateAccountNumber
 * 2. creer des messages personnalisé sur l'utilisateur existe deja, son compte a été créer
 */
public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "Cet utilisateur a déjà un compte créé !";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Le compte a été créé avec succès !";
    public static final String ACCOUNT_NOT_EXIST_CODE = "003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE = "L'utilisateur avec le numéro de compte fourni n'existe pas";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_SUCCESS = "Compte utilisateur trouvé";
    public static final String ACCOUNT_CREDITED_SUCCESS = "005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "Le compte utilisateur a été crédité avec succès";
    public static final String INSUFFICIENT_BALANCE_CODE = "006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE = "Solde insuffisant";
    public static final String ACCOUNT_DEBITED_SUCCESS = "007";
    public static final String ACCOUNT_DEBITED_MESSAGE = "Le compte a été débité avec succès";

    public static final String TRANSFER_SUCCESSFULL_CODE = "008";
    public static final String TRANSFER_SUCCESSFUL_MESSAGE = "Transfer reussi avec succès!";

    public static String generateAccountNumber() {


        Year currentYear = Year.now();

        int min = 100000;

        int max = 999999;

        //generate random number between min and max
        int randNumber= (int) Math.floor(Math.random() * (max - min + 1) + min);

        //convert random number to string, et concatener avec l'annee en cours
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNumber).toString();

    }
}
