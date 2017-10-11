package com.leanmentors.account.aggregator.usermangement.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public @Data @AllArgsConstructor class User {

    public User(){

    }

    @Id @GeneratedValue
    private Long id;

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
}
