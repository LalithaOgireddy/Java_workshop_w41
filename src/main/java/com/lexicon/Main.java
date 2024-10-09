package com.lexicon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        boolean nextOp = true;
        while(nextOp) {
            System.out.println("\nOperations: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter choice of operation: ");
            int op = input1.nextInt();
            double result = 0;
            int inputNum;
            if(op != 5) {
                if(op==1 || op==2){
                    System.out.println("How many operands you want to give: ");
                    int inputCnt = input1.nextInt();
                    System.out.println("Enter input numbers separated by space: ");
                    for(int i=0;i<inputCnt;i++){
                        if(op==1) {
                            inputNum = input1.nextInt();
                            result += inputNum;
                        } else {
                            inputNum = input1.nextInt();
                            result -= inputNum;
                        }
                    }

                    System.out.printf("Result: %f",result);
                } else {
                    System.out.println("Enter number1: ");
                    int num1 = input1.nextInt();
                    System.out.println("Enter number2: ");
                    int num2 = input1.nextInt();
                    switch (op) {
                        case 3:
                            result = num1 * num2;
                            System.out.printf("Result: %d * %d = %f", num1, num2, result);
                            break;
                        case 4:
                            result = num1 / num2;
                            System.out.printf("Result: %d / %d = %f", num1, num2, result);
                            break;
                        default:
                            System.out.println("Enter proper input.");
                    }
                }
            } else nextOp = false;
        }
    }
}