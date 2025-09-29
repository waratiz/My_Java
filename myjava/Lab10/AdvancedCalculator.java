package Lab10;

import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


    }

    public static int add(int num1,int num2){
        int result =0;
        result = num1+num2;
        return result;
    }
    public static double add(double num1,double num2){
        double result =0;
        result = num1+num2;
        return result;
    }
    public static double add(int num1,double num2){
        double result =0;
        result = num1+num2;
        return result;
    }

    public static int subtract(int num1,int num2){
        int result =0;
        result = num1-num2;
        return result;
    }
    public static double subtract(double num1,double num2){
        double result =0;
        result = num1-num2;
        return result;
    }
    public static double subtract(int num1,double num2){
        double result =0;
        result = num1-num2;
        
        return result;
    }

    public static int multiply(int num1,int num2){
        int result =0;
        result = num1*num2;

        return result;
    }
    public static double multiply(double num1,double num2){
        double result =0;
        result = num1*num2;
        return result;
    }
    public static double multiply(int num1,double num2){
        double result =0;
        result = num1*num2;
        return result;
    }

    public static double divide(int num1,int num2){
        double result =0;
        
        if (num1 !=0 && num2 !=0 ) {
            result = num1/num2;
        }else{
            System.out.println("Division by zero");
        }
        return result;
    }
    public static double divide(double num1,double num2){
        double result =0;
        result = num1*num2;
        return result;
    }
    public static double divide(int num1,double num2){
        double result =0;
        result = num1*num2;
        return result;
    }

    public static double power(double num1,int num2){
        double result =0;
        result = Math.pow(num1, num2);
        return result;
    }
}
