package com.javastart.deposit.Rest;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "account-service", contextId = "THIS-SHOULD-BE-UNIQUE")
public interface AccountService {
    @RequestMapping(value = "/accounts/{accountId}", method = RequestMethod.GET)
    AccountResponseDTO getAccountId(@PathVariable("accountId") Long accountId);
}
