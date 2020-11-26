package com.company.ClassRelationship;

public class Task {

    Worker[] workers;
    String name;

    public Task(String name, Worker w1, Worker w2) {

        this.name = name;
        workers = new Worker[2];
        workers[0] = w1;
        workers[1] = w2;

    }

    public String toString() {

        return name + " " + workers[0].name +" " + workers[1].name;

    }
}
