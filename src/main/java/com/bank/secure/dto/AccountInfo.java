package com.bank.secure.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfo {

    @Schema(description = "Nom du titulaire du compte")
    private String accountName;

    @Schema(description = "Solde actuel du compte")
    private BigDecimal accountBalance;

    @Schema(description = "Numéro unique du compte bancaire")
    private String accountNumber;
}
