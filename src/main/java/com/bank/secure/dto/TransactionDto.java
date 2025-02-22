package com.bank.secure.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionDto {

    @Schema(description = "Type de transaction")
    private String transactionType;

    @Schema(description = "Montant de la transaction")
    private BigDecimal amount;

    @Schema(description = "Numéro du compte concerné par la transaction")
    private String accountNumber;

    @Schema(description = "Statut de la transaction")
    private String status;
}
