package com.coderly.inmobipay.api.model.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CreditRequest {

    @NotNull
    @DecimalMin(value = "7.2", inclusive = false, message = "Invalid rate value")
    private double rate;

    @Min(value = 60, message = "The minimum amount payments is 60 months")
    @Max(value = 300, message = "The maximum minimum amount payments is 300 months")
    @NotNull
    private Integer amountPayments;

    @Min(value = 65200, message = "The property value must be greater than 65200")
    @Max(value = 464200, message = "The property value must be less than 464200")
    @NotNull
    private double propertyValue;

    @NotNull
    @DecimalMin(value = "0.001", inclusive = false, message = "Invalid loan amount value")
    private double loanAmount;

    @NotNull
    @DecimalMin(value = "0.001", inclusive = false, message = "Invalid lien insurance value")
    private double lienInsurance;

    @NotNull
    @DecimalMin(value = "0.001", inclusive = false, message = "Invalid all risk insurance value")
    private double allRiskInsurance;

    @NotNull
    private Boolean isPhysicalShipping;

    @NotNull
    @NotEmpty
    private String interestRateType;

    @NotNull
    private Boolean isGoodPayerBonus;

    @NotNull
    private Boolean isGreenBonus;

    @NotNull
    @DecimalMin(value = "0.001", inclusive = false, message = "Invalid COK value")
    private double cokRate;
}
