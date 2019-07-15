package com.example.demo.domain.repository;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.domain.model.UsersEntity;

@ConfigAutowireable
@Dao
public interface UsersRepository {

    @Select
    List<UsersEntity> selectAll();
}