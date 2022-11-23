package com.javastart.bill.controller;

import com.javastart.bill.Dto.BillRequestDto;
import com.javastart.bill.Dto.BillResponseDto;
import com.javastart.bill.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class BillController {
    private final BillService billService;

    @Autowired
    public BillController(BillService billService) {
        this.billService = billService;
    }
    @GetMapping("/{billId}")
    public BillResponseDto getBill(@PathVariable Long billId) {
        return new BillResponseDto(billService.getBillId(billId));
    }
    @PostMapping("/")
    public Long createBill(@RequestBody BillRequestDto billRequestDto) {
        return billService.createBill(billRequestDto.getAccountId(),
                billRequestDto.getAmount(), billRequestDto.getIsDefault(),
                billRequestDto.getCreationDateTime(), billRequestDto.getOverDraftEnabled());
    }
    @PutMapping("/{billId}")
    public BillResponseDto update(@PathVariable Long billId, @RequestBody BillRequestDto billRequestDto) {
        return new BillResponseDto(billService.updateBill(billId, billRequestDto.getAccountId(),
                billRequestDto.getAmount(), billRequestDto.getIsDefault(),
                billRequestDto.getCreationDateTime(), billRequestDto.getOverDraftEnabled()));
    }
    @DeleteMapping("/{billId}")
    public BillResponseDto deleteBill(@PathVariable Long billId){
        return new BillResponseDto(billService.deleteBill(billId));
    }

}
