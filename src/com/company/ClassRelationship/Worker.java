package com.company.ClassRelationship;

public class Worker {

   public String name;
   public String type;

   public Worker(String name, String type) {

       this.name = name;
       this.type = type;

   }

    public String toString() {
       return name + " " + type;
    }
}
