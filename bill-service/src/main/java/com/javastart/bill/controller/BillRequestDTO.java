package com.javastart.bill.controller;

import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
@Getter
public class BillRequestDTO {

    private Long accountId;

    private BigDecimal amount;

    private Boolean isDefault;

    private OffsetDateTime creationDate;

    private Boolean overdraftEnabled;
}
