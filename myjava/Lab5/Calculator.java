package Lab5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1;
        double num2;
        double result = 0;
        char operator;

        System.out.println("Enter first number ");
        num1 = input.nextDouble();

        System.out.println("Enter second number ");
        num2 = input.nextDouble();

        System.out.println("Enter an opetator (+,-,*,/): ");
        operator = input.next().charAt(0);

            if (operator == '+') {
                result = num1 + num2;
                System.out.println("The result is " + result);
            } else if (operator == '-') {
                result = num1 - num2;
                System.out.println("The result is " + result);
            } else if (operator == '*') {
                result = num1 * num2;
                System.out.println("The result is " + result);
            } else if (operator == '/') {
                if (num2!=0) {
                result = num1 / num2;
                System.out.println("The result is " + result);
                }else{
                    System.out.println("Error!");
                }
                
            } else {
                System.out.println("Invalid operator.");
            }
    }
}