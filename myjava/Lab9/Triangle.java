package Lab9;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first angle");
        int a = input.nextInt();
        System.out.println("Enter second angle");
        int b = input.nextInt();
        System.out.println("Enter third angle");
        int c = input.nextInt();


    
        System.out.println(classifyTriangle(a, b, c));

    input.close();
    }


    public static String classifyTriangle(double a, double b, double c){

        String result = "";

        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            if ((a == b) && (b == c) && (a == c)) {
                result = ("Equilateral: All three sides are equal.");
            }

            if ((a == b) || (b == c) || (a == c)) {
                result = ("Isosceles: Exactly two sides are equal.");
            }

            if ((a != b) && (b != c) && (a != c)) {
                result = ("Scalene: No sides are equal.");
            }
        }else{
            result = ("These sides cannot form a valid triangle");
        }

        return result;
    }
}
