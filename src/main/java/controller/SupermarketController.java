package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import service.BasketServiceImpl;

@RestController
public class SupermarketController {

    @Autowired
    BasketServiceImpl basketService;

    @RequestMapping("/")
    public String index() {
        return "Supermarket Spring Boot based app";
    }

}