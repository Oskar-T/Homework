package com.company.product;

public class Order {

    public Order(Product p1, Product p2) {

        products = new Product[2];
        products[0] = p1;
        products[1] = p2;

    }

    public String toString() {
        return products[0].toString() + products[1].toString() ;
    }

    Product[] products;


}
