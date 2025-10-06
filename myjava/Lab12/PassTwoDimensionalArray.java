package Lab12;

import java.util.Scanner;

public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] m = getArray(); // Get an array

        // Display sum of elements using a void method
        printSum(m);
        printArr(m);
    }

    public static int[][] getArray() {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Enter array values
        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }

        return m;
    }

    // Modified method: uses void and prints the result directly
    public static void printSum(int[][] m) {
        int total = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                total += m[row][column];
            }
        }
        System.out.println("\nSum of all elements is " + total);
    }

    public static void printArr(int[][] m) {
        System.out.println("Array are :");
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                System.out.print(m[row][column] + " ");
            }
            System.out.println();
        }
    }
}
