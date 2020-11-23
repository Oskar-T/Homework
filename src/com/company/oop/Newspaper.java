package com.company.oop;

public class Newspaper {

    private String name;
    private int year;
    private int month;
    private int dayOfMonth;
    private boolean isFinnish;

    public Newspaper(String name, int year, int month, int dayOfMonth, boolean isFinnish) {
        this.name = name;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.isFinnish = isFinnish;
    }

    public String getName() {
        return name;
    }

    public void setDate(int year, int month, int dayOfMonth) {

        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    public boolean isFinnish() {
        return isFinnish;
    }

    public String toString() {
        return (name + " " + dayOfMonth + "/" + month + "/" + year + " is Finnish?: " + isFinnish);
    }
}
