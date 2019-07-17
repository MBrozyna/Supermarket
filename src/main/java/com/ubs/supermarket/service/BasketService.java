package com.ubs.supermarket.service;

import com.ubs.supermarket.model.Basket;
import com.ubs.supermarket.model.Product;
import java.util.List;
import java.util.Optional;

public interface BasketService {

    Basket add(Product product, Integer basketId) throws Exception;

    Basket remove(Product product);

    int checkPrice(Basket basket);

    Optional<List<Product>> getAllProducts(Integer basketId);
}
