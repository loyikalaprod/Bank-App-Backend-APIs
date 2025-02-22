package com.bank.secure.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditDebitRequest {

    @Schema(description = "Numéro unique du compte bancaire concerné par l'opération")
    private String accountNumber;

    @Schema(description = "Montant de la transaction")
    private BigDecimal amount;
}
