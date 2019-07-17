package com.ubs.supermarket.service;

import com.ubs.supermarket.model.Basket;
import com.ubs.supermarket.model.Product;
import java.util.List;

public interface BasketService {

    Basket add(Product product);

    Basket remove(Product product);

    int checkPrice(Basket basket);

    List<Product> getAllProducts(Basket basket);
}
