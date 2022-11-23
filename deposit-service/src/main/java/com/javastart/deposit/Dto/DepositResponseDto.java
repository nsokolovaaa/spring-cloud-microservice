package com.javastart.deposit.Dto;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class DepositResponseDto {
    private BigDecimal amount;
    private String email;
}


