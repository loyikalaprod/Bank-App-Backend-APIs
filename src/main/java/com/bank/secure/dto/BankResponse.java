package com.bank.secure.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankResponse {

    @Schema(description = "Code de réponse de l'opération bancaire")
    private String responseCode;

    @Schema(description = "Message détaillé de la réponse")
    private String responseMessage;

    @Schema(description = "Informations du compte concerné par l'opération")
    private AccountInfo accountInfo;
}
