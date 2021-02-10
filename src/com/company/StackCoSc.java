package com.company;

import java.util.Scanner;
import ibadts.*;

public class StackCoSc {

    public static void example1() {
        int n = 13;
        Stack stack = new Stack();

        while (n > 0) {
            stack.push(n % 2);
            n = n/2;
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    public static void example2() {

        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.next();
            if(input.equals("END")) {
                break;
            }
            stack.push(input);
        }

        scanner.close();

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }



    }

    public static void example3() {
        int N = 100;

        Stack<Integer> stack = new Stack();
        while (N > 1) {
            stack.push(N);
            N--;
        }
        int sum = 1;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println(sum);


    }

    public static void hw1() {

        // 5
        // 11 5
        // 14 11 5
        // output: 14 (11, 5)
        // 11, 5
    }

    public static void hw2() {

        final int size = 5;
        StaticStack staticStack = new StaticStack(size);
        Scanner scanner = new Scanner(System.in);
        while (!staticStack.isFull()) {
            staticStack.push(scanner.next());
        }
        while (!staticStack.isEmpty()) {
            System.out.println(staticStack.pop());
        }


    }

    public static boolean hw3() {

        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        while (!scanner.next().equals("-1")) {

            String str = scanner.next();
            if(str.equals("[") || str.equals("(") || str.equals("{")) {
                stack.push(str);
            }
            // is replaceable with switch statement instead of if
            String check;
            if (")".equals(str)) {
                check = stack.pop();
                if (check.equals("{") || check.equals("[")) {
                    return false;
                }
            } else if ("}".equals(str)) {
                check = stack.pop();
                if (check.equals("(") || check.equals("[")) {
                    return false;
                }
            } else if ("]".equals(str)) {
                check = stack.pop();
                if (check.equals("(") || check.equals("{")) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
