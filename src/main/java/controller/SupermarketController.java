package controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SupermarketController {

    @RequestMapping("/")
    public String index() {
        return "Supermarket Spring Boot based app";
    }

}