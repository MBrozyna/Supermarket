package service;

import model.Basket;
import model.Product;

import java.util.List;

public interface BasketService {

    Basket add(Product product);

    Basket remove(Product product);

    int checkPrice(Basket basket);

    List<Product> getAllProducts(Basket basket);
}
