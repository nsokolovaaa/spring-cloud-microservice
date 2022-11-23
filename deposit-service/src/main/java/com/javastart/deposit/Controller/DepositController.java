package com.javastart.deposit.Controller;

import com.javastart.deposit.Dto.DepositResponseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositController {
    @PostMapping("/deposits")
    public DepositResponseDto depositResponseDto(){

    }
}
