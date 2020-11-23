package com.company.ClassRelationship;

public class Project {


    private int id;
    private Task[] tasks;
    private static int nextInt = 1;


    public Project(int numberOfTasks, Task[] tasks) {
        this.id = nextInt;
        nextInt++;
        this.tasks = tasks;
    }


    public int getId() {
        return id;
    }

    public void addTask(Task task, int id) {
        tasks[id] = task;
    }

}
