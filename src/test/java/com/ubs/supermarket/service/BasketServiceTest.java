package com.ubs.supermarket.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.ubs.supermarket.Application.class)
public class BasketServiceTest {

    @Autowired
    BasketServiceImpl basketService;

    @Test
    public void basketServiceShouldBeAppliedWithAllProducts(){
        assertTrue(basketService.productsAvailable.size()>0);
    }
}
