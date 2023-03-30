package javaweek3writinghw;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int number = sc.nextInt();
        isItOddOrEvenNumber(number);
        sc.close();
    }

    public static void isItOddOrEvenNumber(int number) {
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number");
    }


}
