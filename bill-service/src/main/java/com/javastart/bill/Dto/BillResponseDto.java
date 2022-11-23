package com.javastart.bill.Dto;

import com.javastart.bill.Entity.Bill;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class BillResponseDto {
    private Long billId;
    private Long accountId;
    private BigDecimal amount;
    private Boolean isDefault;
    private OffsetDateTime creationDateTime;
    private Boolean overDraftEnabled;

    public BillResponseDto(Bill bill){
        billId = bill.getBillId();
        accountId = bill.getAccountId();
        amount = bill.getAmount();
        isDefault = bill.getIsDefault();
        creationDateTime = bill.getCreationDateTime();
        overDraftEnabled = bill.getOverDraftEnabled();
    }
}
