package com.company.oop;

public class User {

    private String lastName, firstName, address;
    private static int nextInt = 1;
    private int userId;

    public User(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = nextInt;
        nextInt++;
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getFirstName() {
        return firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String getLastName() {
        return lastName;
    }

    public int getUserId() {
        return userId;
    }

    public String toString() {
        return ("name: " + firstName + " " + lastName + " user ID: " + userId + " address: " + address);
    }


}
