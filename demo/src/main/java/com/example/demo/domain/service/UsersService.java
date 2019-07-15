package com.example.demo.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.model.UsersEntity;
import com.example.demo.domain.repository.UsersRepository;

@Service
public class UsersService {

    @Autowired
    UsersRepository  usersRepository;

    public List<UsersEntity> getSample () {
        return usersRepository.selectAll();
    }
}