package Lab11;

import java.util.Scanner;

public class Methodarr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number :");
        int n = input.nextInt();
        double[] numbers = new double[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }

        
        System.out.println("Numbers in array: " + printArray(numbers));
        System.out.println("Maximum is :" + findMax(numbers));
        System.out.println("Minimum is :" + findMin(numbers));
        input.close();
    }

    public static String printArray(double[] arr) {
        String array = "";
        for (int i = 0; i < arr.length; i++) {
            array += arr[i] + " ";
        }
        return array.trim(); // remove trailing space
    }

    public static double findMax(double[] arr){
        double result =0;
         for (int i = 0; i < arr.length; i++) {
            if (result < arr[i]) {
                result = arr[i];
            }
         }
        return result;
    }

    public static double findMin(double[] arr){
        double result =1000000;
         for (int i = 0; i < arr.length; i++) {
            if (result > arr[i]) {
                result = arr[i];
            }
         }
        return result;
    }
}
