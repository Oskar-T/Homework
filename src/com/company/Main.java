package com.company;

import com.company.product.Order;
import com.company.product.Warehouse;

public class Main {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Order order = new Order(warehouse.laptops[0],
                                warehouse.routers[1]);

        System.out.println(order);

    }
}
