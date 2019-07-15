package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.model.UsersEntity;
import com.example.demo.domain.service.UsersService;

@RestController
public class UsersController {

    @Autowired
    UsersService usersService;

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public List<UsersEntity> getSample () {
        return usersService.getSample();
    }

}