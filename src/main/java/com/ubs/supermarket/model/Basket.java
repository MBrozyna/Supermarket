package com.ubs.supermarket.model;

import java.util.List;

public class Basket {

    List<Product> productList;
    int totalPrice;

    public Basket(List<Product> productList, int totalPrice) {
        this.productList = productList;
        this.totalPrice = totalPrice;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
