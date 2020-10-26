package com.company;

import ibadts.*;

public class Collections extends Main {

    static void hw1() {
        IBCollection<String> names = new IBCollection<String>();
        names.add(new String[]{"John", "Marie"});
        for(int i = 0; i < 2; i++) {
            names.resetNext();
            while (names.hasNext()) {
                System.out.println(names.getNext());
            }
        }
    }

    static void hw2() {


    }

}
