package com.company;

import java.util.Arrays;

public class TwoDimensionalArrays {

    public static void Example1() {
        String[][] arr = {{"John", "Birgitte", "Greta"}, {"doctor", "lawyer", "doctor"}, {"US", "GB", "SW"}};

        String occupation = "doctor";
        for (String[] personData : arr) {
            if (personData[1].equals(occupation)) {
                System.out.println(personData[0] + " " + personData[2]);
            }
        }

    }

    public static void Example2() {

        final int N = 7;
        int[][] table = new int[N][N];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                table[r][c] = (r + 1) / (c + 1);
                System.out.print(table[r][c] + " ");
            }
            System.out.println();
        }

    }

    public static void Example3() {

        final int N = 7;
        int counter = 0;
        int[][] table = new int[N][N];
        for (int r = 0; r < table.length; r++) {
            for (int c = 0; c < table.length; c++) {
                table[r][c] = counter++;
            }
            System.out.println();
        }

    }

    public static void hw1() {

        // 1. 2
        // 2. 6
        // 3. 4 5

        //4.  0: 0 + A[1][0] - A[0][0]
        //    S = 4 - 2 = 2
        //    2 + 9 - 1 = 10
        //    10 + 3 = 13
        //    13 + 5 - 7 = 11


    }

    public static void hw2() {

        int[][] arr = new int[6][5];
        arr[0][3] = 4;
        arr[2][0] = -19;
        arr[3][2] = 7;
        arr[5][3] = 22;

        for(int r = 0; r < 6; r++) {

            for(int c = 0; c < 5; c++) {
                System.out.print(arr[r][c] +" ");
            }
            System.out.println();

        }

    }

    public static void hw3() {

        String[][] arr = {{"a", "b", "d"},
                {"d", "e", "f"}, {"g", "d", "i"}};

        String key = "d";
        boolean found = false;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr.length; c++) {
                if (arr[r][c].equals(key)) {
                    System.out.println("row: " + r + " column: " + c);
                }
            }
        }
    }

    public static void hw4() {

        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int sOfRows = 0;
        int sOfColumns = 0;
        int sOfAll = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sOfRows += arr[i][j];
                sOfColumns += arr[j][i];
                sOfAll += arr[i][j];
            }
            System.out.println("sum of row number " + i + " is: " + sOfRows);
            System.out.println("sum of column number " + i + " is: " + sOfColumns);
            sOfRows = 0;
            sOfColumns = 0;
        }
        System.out.println("sum of all elements is: " + sOfAll);

    }

    public static void hw5() {

       // palindrome

    }

    static void hw6() {
        //idk
    }



}
