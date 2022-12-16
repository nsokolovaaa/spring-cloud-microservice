package com.javastart.deposit.Repository;

import com.javastart.deposit.Entity.Deposit;
import org.springframework.data.repository.CrudRepository;

public interface DepositRepository extends CrudRepository<Deposit, Long> {
}
