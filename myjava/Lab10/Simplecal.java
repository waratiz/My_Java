package Lab10;

import java.util.Scanner;

public class Simplecal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Adding two int");
        int num1 = input.nextInt();
        System.out.println("Adding two int");
        int num2 = input.nextInt();
        System.out.println("-------------------");
        System.out.println("Adding three int");
        int num3 = input.nextInt();
        System.out.println("Adding three int");
        int num4 = input.nextInt();
        System.out.println("Adding three int");
        int num5 = input.nextInt();
        System.out.println("-------------------");
        System.out.println("Adding two double");
        double num6 = input.nextDouble();
        System.out.println("Adding two double");
        double num7 = input.nextDouble();
        System.out.println("-------------------");
        System.out.println("Adding three double");
        double num8 = input.nextDouble();
        System.out.println("Adding three double");
        double num9 = input.nextDouble();
        System.out.println("Adding three double");
        double num10 = input.nextDouble();


        add(num1, num2);
        add(num3,num4,num5);
        add(num6, num7);
        add(num8,num9,num10);
    }

    public static void add(int num1, int num2) {
        int result=0;
        result =num1 + num2;
        System.out.println("Add two int "+ num1 +"+"+num2+": "+result);
    }

    public static void add(int num1, int num2, int num3) {
        int result=0;
        result =num1 + num2+num3;
        System.out.println("Add three int "+ num1 +"+"+num2+"+"+num3+": "+result);
    }

    public static void add(double num1, double num2) {
        double result=0;
        result =num1 + num2;
        System.out.println("Add two double "+ num1 +"+"+num2+": "+result);
    }

    public static void add(double num1, double num2, double num3) {
        double result=0;
        result =num1 + num2+num3;
        System.out.println("Add three double "+ num1 +"+"+num2+"+"+num3+": "+result);
    }
}
