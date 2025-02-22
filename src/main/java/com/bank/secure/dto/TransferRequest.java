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
public class TransferRequest {

    @Schema(description = "Numéro du compte source pour le transfert")
    private String sourceAccountNumber;

    @Schema(description = "Numéro du compte destination pour le transfert")
    private String destinationAccountNumber;

    @Schema(description = "Montant à transférer")
    private BigDecimal amount;
}
