package com.leanmentors.account.aggregator.usermangement.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

public @Data @AllArgsConstructor class User {

    String userName;
    String password;
    String firstName;
    String lastName;
}
