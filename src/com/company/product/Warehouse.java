package com.company.product;

public class Warehouse {

    public Warehouse() {
        laptops = new Laptop[2];
        routers = new Router[2];
        laptops[0] = new Laptop("MacBook", 1500);
        laptops[1] = new Laptop("Lenovo y512", 2000);
        routers[0] = new Router("TP_LINK", 100);
        routers[1] = new Router("XYZ", 200);
    }

    public Laptop[] laptops;
    public Router[] routers;
}
