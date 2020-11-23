package com.company.ClassRelationship;

public class Task {

    private String name;
    private int numberOfEmployees;
    private Worker[] workers;

    public Task(String name, Worker[] workers) {
        this.name = name;
        this.workers = workers;
    }

    public void addWorker(int id, Worker worker) {
        this.workers[id] = worker;
    }

    public String getName() {
        return name;
    }
}
