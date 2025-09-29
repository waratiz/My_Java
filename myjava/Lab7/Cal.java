package Lab7;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        
        while (condition) {
            System.out.println("Choose number: 1. Addition 2. Subtraction  3. Multiply  4. Division  5. Exit");
            int choice = input.nextInt();
            if (choice == 5) {
                System.out.println("Exiting program");
                condition = false;
                break;
            }

            if ((choice >5) || (choice <1)) {
                System.out.println("Please select 1-5");
                continue;
            }

            System.out.print("Enter number 1: ");
            double num1 = input.nextDouble();
            System.out.print("Enter number 2: ");
            double num2 = input.nextDouble();
            double result;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("The result is : " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("The result is : " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("The result is : " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("The result is : " + result);
                    } else {
                        System.out.println("Error: cannot divide by 0");
                    }
                    break;
                default:
                    System.out.println("Error");
            }
        }
        input.close();
    }
}
