package com.example.demo.domain.model;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Table(name = "users")
public class UsersEntity {

    @Id
    private int id;

    private String name;
}