package com.hackerrank.loops;

import java.util.Scanner;

public class LoopsTwo {

    // Sample input
    // 2
    // 0 2 10
    // 5 3 5
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = 2;
        for (int i = 0; i < q; i++) // this can act as q, each new iteration is
        // a new line for a new series
        {
            int a = 5; // a represents the value to add
            int b = 3; // b is the number to apply an indice
            int n = 5; // this is the number of values from the series in one line
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum = sum + ((int) Math.pow(2, j) * b);
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
