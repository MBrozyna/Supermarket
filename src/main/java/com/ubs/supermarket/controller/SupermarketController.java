package com.ubs.supermarket.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ubs.supermarket.service.BasketServiceImpl;

@RestController
public class SupermarketController {

    public static final Logger logger = LoggerFactory.getLogger(SupermarketController.class);

    @Autowired
    BasketServiceImpl basketService;

    @RequestMapping("/")
    public String index() {
        return "Supermarket Spring Boot based app";
    }

}