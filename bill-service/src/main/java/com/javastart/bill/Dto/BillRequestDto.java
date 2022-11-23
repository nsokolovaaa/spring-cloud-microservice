package com.javastart.bill.Dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
@Data
public class BillRequestDto {
    private Long billId;
    private Long accountId;
    private BigDecimal amount;
    private Boolean isDefault;
    private OffsetDateTime creationDateTime;
    private Boolean overDraftEnabled;

}
