package com.ubs.supermarket.service;

import com.ubs.supermarket.model.Basket;
import com.ubs.supermarket.model.Product;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.ubs.supermarket.Application.class)
public class BasketServiceTest {

    @Autowired
    BasketServiceImpl basketService;

    @Before
    public void addToCart(){
        List<Product> productsAvailable = basketService.getProductsAvailable();
        basketService.cart.put(0, new Basket(productsAvailable));
    }

    @Test
    public void basketServiceShouldBeAppliedWithAllProducts(){
        assertTrue(basketService.getProductsAvailable().size()>0);
    }

    @Test
    public void getAllProductsShouldReturnEmptyOptionalIfNoElement(){

        assertTrue(basketService.getAllProducts(1).equals(Optional.empty()));
    }

    @Test
    public void shouldReturn4ProductBasket(){
        assertTrue(basketService.getAllProducts(0).equals(Optional.of(basketService.getProductsAvailable())));
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionIfNoSuchBasket() throws Exception {
        basketService.add(new Product("", 10), 2);
    }

    @Test()
    public void newElementShouldBeAddedCorrectly() throws Exception {
        basketService.add(new Product("A", 40), 0);
        assertTrue(basketService.getAllProducts(0).get().size()==5);
    }



}
