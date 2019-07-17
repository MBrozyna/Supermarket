package com.ubs.supermarket.service;


import com.ubs.supermarket.model.Basket;
import com.ubs.supermarket.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service("basketService")
public class BasketServiceImpl implements BasketService{

    ConcurrentHashMap<Integer, Basket> cart;
    private List<Product> productsAvailable;

    public BasketServiceImpl() {
        this.productsAvailable = new ArrayList<>();
        this.cart = new ConcurrentHashMap<>();
        try {
            applyAvailableProducts();
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
    }

    @Override
    public Basket add(Product product, Integer basketId) {

        return null;
    }

    @Override
    public Basket remove(Product product) {
        return null;
    }

    @Override
    public int checkPrice(Basket basket) {
        return 0;
    }

    @Override
    public Optional<List<Product>> getAllProducts(Integer basketId) {
        return cart.containsKey(basketId)?Optional.ofNullable(cart.get(basketId)).map(o -> productsAvailable): Optional.empty();
    }


    private List<Product> applyAvailableProducts() throws Exception {
        if(this.productsAvailable.isEmpty()){

            this.productsAvailable.add(new Product("A", 40, 70,3 ));
            this.productsAvailable.add(new Product("B", 10, 15,2 ));
            this.productsAvailable.add(new Product("C", 10));
            this.productsAvailable.add(new Product("D", 25));

            return this.productsAvailable;
        }
        throw new Exception("Product list apply is not available if already exist.");
    }

    protected List<Product> getProductsAvailable() {
        return productsAvailable;
    }
}
