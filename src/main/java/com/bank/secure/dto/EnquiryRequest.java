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
public class EnquiryRequest {

    @Schema(description = "Numéro unique du compte bancaire pour la requête")
    private String accountNumber;
}
