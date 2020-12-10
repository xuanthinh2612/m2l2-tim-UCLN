package com.company;

import java.util.Scanner;

public class timUCLN {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert your first number");
        int num1 = scanner.nextInt();
        System.out.println("insert your second number");
        int num2 = scanner.nextInt();
        num1=Math.abs(num1);
        num2=Math.abs(num2);
        if (num1==0) {
            if (num2==0){
                System.out.println("No greatest common factor");
            } else {
                System.out.printf("the greatest common factor is: %d",num2);
            }
        } else if (num2==0) {
            System.out.printf("the greatest common factor is: %d",num1);
        } else {
            while (num1!=num2) {
                if (num1>num2) {
                    num1=num1-num2;
                } else {
                    num2=num2-num1;
                }
            }
            System.out.printf("the greatest common factor is: %d",num1);
        }
    }
}
