package com.javastart.account.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;


@Data
@Entity

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long accountId;
    private String email;
    private String name;
    private String phone;
    private OffsetDateTime creationDate;
    @ElementCollection
    private List<Long> bills;


    public Account() {

    }

    public Account(String email, String name, String phone,OffsetDateTime creationDate,  List<Long> bills) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.bills = bills;
        this.creationDate = creationDate;
    }
}
