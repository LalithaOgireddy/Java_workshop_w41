package com.lexicon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean nextOp = true;
        while(nextOp) {
            System.out.println("\nOperations: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter choice of operation: ");
            int op = input.nextInt();
            if(op != 5) {
                System.out.println("Enter number1: ");
                int num1 = input.nextInt();
                System.out.println("Enter number2: ");
                int num2 = input.nextInt();
                int result;
                switch (op) {
                    case 1:
                        result = num1 + num2;
                        System.out.printf("Result: %d + %d = %d", num1, num2, result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.printf("Result: %d - %d = %d", num1, num2, result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.printf("Result: %d * %d = %d", num1, num2, result);
                        break;
                    case 4:
                        result = num1 / num2;
                        System.out.printf("Result: %d / %d = %d", num1, num2, result);
                        break;
                    default:
                        System.out.println("Enter proper input.");
                }
            } else nextOp = false;
        }
    }
}