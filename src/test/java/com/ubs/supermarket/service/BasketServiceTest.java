package com.ubs.supermarket.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.ubs.supermarket.Application.class)
public class BasketServiceTest {

    @Autowired
    BasketServiceImpl basketService;

    @Test
    public void basketServiceShouldBeAppliedWithAllProducts(){
        assertTrue(basketService.getProductsAvailable().size()>0);
    }

    @Test
    public void getAllProductsShouldReturnEmptyOptionalIfEmpty(){
        assertTrue(basketService.getAllProducts(0).equals(Optional.empty()));
    }
}
