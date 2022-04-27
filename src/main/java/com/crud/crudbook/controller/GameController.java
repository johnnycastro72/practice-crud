package com.crud.crudbook.controller;

import com.crud.crudbook.service.GameServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class GameController {

    @Autowired
    private GameServiceInterface service;


}
