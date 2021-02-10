package com.company;

import java.util.Arrays;

public class IntQueue {

    private int capacity;
    private int itemsCount;
    private int[] IntQueue;

    IntQueue(int capacity){
        this.capacity = capacity;
        itemsCount = 0;
        IntQueue = new int[capacity];
    }

    void enqueue(int item) {
        itemsCount++;
        IntQueue[itemsCount-1] = item;

    }

    int dequeue() {
        itemsCount--;
        int storingInt = IntQueue[0];
        for(int i = 0; i < itemsCount; i++) {
            IntQueue[i] = IntQueue[i+1];
        }
        IntQueue[itemsCount] = 0;
        return storingInt;
    }

    boolean isEmpty() {
        return itemsCount == 0;
    }

    boolean isFull() {
        return itemsCount >= capacity;
    }

    public String toString() {
        return Arrays.toString(IntQueue);
    }
}
