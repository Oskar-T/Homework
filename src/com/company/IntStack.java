package com.company;

import java.util.Arrays;

public class IntStack {

    IntStack (int capacity){

        this.capacity = capacity;
        itemsCount = 0;
        IntStack = new int[capacity];

    }

    private int capacity;
    private int itemsCount;
    private int[] IntStack;

    void push(int item) {

        if(isEmpty()) {
            IntStack[0] = item;
            itemsCount++;
        } else if(!isFull() && !isEmpty()) {
            for(int i = itemsCount; i > 0; i--) {
                IntStack[i] = IntStack[i-1];
            }
            IntStack[0] = item;
            itemsCount++;
        } else {
            System.out.println("It's full");
        }

    }

    int pop() {
            if(!isEmpty()) {
                itemsCount--;
                int item = IntStack[0];
                for (int i = 1; i <= itemsCount; i++) {
                    IntStack[i - 1] = IntStack[i];
                }
                IntStack[itemsCount] = 0;
                return item;
            } else {
                return -1;
            }
    }

    boolean isEmpty() {
       return itemsCount == 0;
    }

    boolean isFull() {
        return itemsCount >= capacity;
    }

    public String toString() {
        return Arrays.toString(IntStack);
    }
}
