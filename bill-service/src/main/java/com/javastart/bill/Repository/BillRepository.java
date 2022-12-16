package com.javastart.bill.Repository;

import com.javastart.bill.Entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BillRepository extends CrudRepository<Bill, Long> {

    List<Bill> getBillsByAccountId(Long accountId);
}