package com.company.oop;

public class Course {

    private String name;
    private String topic;
    private String nameOfTeacher;
    private int number;

    public Course(String name, String topic, String nameOfTeacher, int number) {

        this.name = name;
        this.topic = topic;
        this.nameOfTeacher = nameOfTeacher;
        this.number = number;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }

    public boolean hasParticipants(int number) {
        return number >= 0;
    }

    public void setNumber(int number) {

        if(!hasParticipants(number)) {
            System.out.println("The number of participants is negative");
        } else {
            this.number = number;
        }
    }

    public String toString() {
        return (name + " " + topic + " " + nameOfTeacher + " " + number);
    }
}

