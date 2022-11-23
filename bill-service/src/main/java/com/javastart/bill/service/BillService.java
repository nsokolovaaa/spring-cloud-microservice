package com.javastart.bill.service;

import com.javastart.bill.Entity.Bill;
import com.javastart.bill.Exception.BillNotFoundException;
import com.javastart.bill.Repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Service
public class BillService {
    private final BillRepository billRepository;
    @Autowired
    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }
    public Bill getBillId(Long billId) {
        return billRepository.findById(billId)
                .orElseThrow(() -> new BillNotFoundException("Don't find billId"));
    }

    public Long createBill(Long accountId,  BigDecimal amount, Boolean isDefault,
                            OffsetDateTime creationDateTime, Boolean overDraftEnabled ){
        Bill bill = new Bill(accountId, amount, isDefault,OffsetDateTime.now(), overDraftEnabled);
        return billRepository.save(bill).getBillId();
    }
    public Bill updateBill(Long billId, Long accountId, BigDecimal amount, Boolean isDefault,
                            OffsetDateTime creationDateTime, Boolean overDraftEnabled ) {
        Bill bill = new Bill(accountId, amount, isDefault, overDraftEnabled);
        bill.setBillId(billId);
        return billRepository.save(bill);

    }
    public Bill deleteBill(Long billId) {
        Bill deleteBill = getBillId(billId);
        billRepository.deleteById(billId);
        return deleteBill;
    }


}
