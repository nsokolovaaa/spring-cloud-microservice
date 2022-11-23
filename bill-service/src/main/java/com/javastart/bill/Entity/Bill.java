package com.javastart.bill.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
@Data
@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long billId;
    private Long accountId;
    private BigDecimal amount;
    private Boolean isDefault;
    private OffsetDateTime creationDateTime;
    private Boolean overDraftEnabled;


    public Bill(Long accountId, BigDecimal amount, Boolean isDefault, Boolean overDraftEnabled) {
        this.accountId = accountId;
        this.amount = amount;
        this.isDefault = isDefault;
        this.overDraftEnabled = overDraftEnabled;
    }

    public Bill(Long accountId, BigDecimal amount, Boolean isDefault, OffsetDateTime creationDateTime, Boolean overDraftEnabled) {
        this.accountId = accountId;
        this.amount = amount;
        this.isDefault = isDefault;
        this.creationDateTime = creationDateTime;
        this.overDraftEnabled = overDraftEnabled;
    }

    public Bill() {

    }
}
