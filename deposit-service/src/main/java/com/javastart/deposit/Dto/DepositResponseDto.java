package com.javastart.deposit.Dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepositResponseDto{

    private BigDecimal amount;

    private String mail;
}


