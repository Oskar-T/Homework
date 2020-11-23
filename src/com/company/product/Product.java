package com.company.product;

public class Product {

    public Product(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return model + " " +  price + "\n";
    }

    public String model;
    public int price;

}
