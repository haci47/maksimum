package com.erg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the first number");
        int a = scan.nextInt();

        System.out.println("enter the second number");
        int b = scan.nextInt();

        System.out.println("enter the third number");
        int c = scan.nextInt();

        int max_ab = Math.max(a, b);
        int max = Math.max(max_ab, c);

        int min_ab = Math.min(a, b);
        int min = Math.min(min_ab, c);
        int difference = max - min ;

        System.out.println("max :" +max);
        System.out.println("min :" +min);
        System.out.println(" difference :" + difference);
    }
}
