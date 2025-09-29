package Lab8;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose even or odd");
        String choose = input.next();

        int sum = 0;

        if (choose.equalsIgnoreCase("odd")) {   
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {   
                    sum += i;
                }
            }
            System.out.println("The sum of odd numbers from 1 to 100 is: " + sum);

        } else if (choose.equalsIgnoreCase("even")) {   
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {   
                    sum += i;
                }
            }
            System.out.println("The sum of even numbers from 1 to 100 is: " + sum);

        } else {
            System.out.println("Invalid choice! Please enter 'even' or 'odd'.");
        }

        input.close();
    }
}
