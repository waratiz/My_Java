package Lab9;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter f. Fahrenheit to Celsius  c. Celsius to Fahrenheit");
        String choice = input.next();

        double result = 0;

        if (choice.equalsIgnoreCase("f")) {
            System.out.print("Enter Fahrenheit: ");
            double f = input.nextDouble();
            result = fahrenheitToCelsius(f);
            System.out.println("Celsius = " + result);
        } else if (choice.equalsIgnoreCase("c")) {
            System.out.print("Enter Celsius: ");
            double c = input.nextDouble();
            result = celsiusToFahrenheit(c);
            System.out.println("Fahrenheit = " + result);
        } else {
            System.out.println("Enter only 1 or 2");
        }
        input.close();
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * (5.0 / 9.0);
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32;
    }
}
