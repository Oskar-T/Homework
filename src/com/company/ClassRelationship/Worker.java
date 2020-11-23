package com.company.ClassRelationship;

public class Worker {

    private String name;
    private String workType;

    public Worker(String name, String workType) {
        this.name = name;
        this.workType = workType;
    }

    public String getName() {
        return name;
    }

    public String getWorkType() {
        return workType;
    }
}
