package service;


import model.Basket;
import model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasketServiceImpl implements BasketService{

    List<Basket> cart;

    public BasketServiceImpl() {
        this.cart = new ArrayList<>();
    }

    @Override
    public Basket add(Product product) {
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
    public List<Product> getAllProducts(Basket basket) {
        return null;
    }
}
