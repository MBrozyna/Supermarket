package com.ubs.supermarket.model;

public class Product{

    private final String name;
    private final int unitPrice;
    private final int specialPrice;
    private final int specialPriceAmmountNeeded;

    public Product(String name, int unitPrice, int specialPrice, int specialPriceAmmountNeeded) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.specialPrice = specialPrice;
        this.specialPriceAmmountNeeded = specialPriceAmmountNeeded;
    }

    public Product(String name, int unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.specialPrice = 0;
        this.specialPriceAmmountNeeded = 0;
    }

    public String getName() {
        return name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getSpecialPrice() {
        return specialPrice;
    }

    public int getSpecialPriceAmmountNeeded() {
        return specialPriceAmmountNeeded;
    }
}
