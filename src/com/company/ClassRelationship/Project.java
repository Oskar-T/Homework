package com.company.ClassRelationship;

import com.company.product.Product;

public class Project {

    Task[] tasks;
    int id;
    int nextId = 1;


    public Project(Task t1, Task t2) {

       this.id = nextId;
       nextId++;
       tasks = new Task[2];
       tasks[0] = t1;
       tasks[1] = t2;

    }

    public String toString() {
       return id + " " + tasks[0] + " " + tasks[1];
    }
}
