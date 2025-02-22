package com.bank.secure.controller;

import com.bank.secure.dto.*;
import com.bank.secure.service.impl.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Tag(name= "Gestion de Comptes Clients APIs")
public class UserController {

    @Autowired
    UserService userService;

    @Operation(
            summary = "Créer un nouveau Compte",
            description = "Créer un nouveau utilisateur et assigner un numéro de Compte"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 CREATED"
    )
    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);
    }

    @Operation(
            summary = "Consulter le solde d'un compte",
            description = "Permet de récupérer le solde actuel d'un compte utilisateur"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 OK"
    )
    @GetMapping("balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestParam String accountNumber) {
        EnquiryRequest request = new EnquiryRequest();
        request.setAccountNumber(accountNumber);
        return userService.balanceEnquiry(request);
    }

    @Operation(
            summary = "Rechercher le nom du titulaire du compte",
            description = "Retourne le nom associé à un numéro de compte"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 OK"
    )
    @GetMapping("nameEnquiry")
    public String nameEnquiry(@RequestParam String accountNumber) {
        EnquiryRequest request = new EnquiryRequest();
        request.setAccountNumber(accountNumber);
        return userService.nameEnquiry(request);
    }

    @Operation(
            summary = "Créditer un compte",
            description = "Ajoute des fonds à un compte bancaire"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 OK"
    )
    @PostMapping("credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request){
        return userService.creditAccount(request);
    }

    @Operation(
            summary = "Débiter un compte",
            description = "Retire des fonds d'un compte bancaire"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 OK"
    )
    @PostMapping("debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request){
        return userService.debitAccount(request);
    }

    @Operation(
            summary = "Effectuer un virement",
            description = "Transférer de l'argent d'un compte à un autre"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 OK"
    )
    @PostMapping("transfer")
    public BankResponse transfer(@RequestBody TransferRequest request){
        return userService.transfer(request);
    }
}
