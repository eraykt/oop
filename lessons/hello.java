package oop.lessons;

import java.util.Scanner;

/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("input a..:");
        a = input.nextInt();
        System.out.printf("a = " + a);
        input.close();
    }
}