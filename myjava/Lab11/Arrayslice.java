package Lab11;
import java.util.Scanner;

public class Arrayslice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = { 10, 20, 30, 40, 50, 60 };
        String[] words = { "alpha", "bravo", "charlie", "delta", "echo" };

        printArray(numbers, words);
        System.out.println("---------------------------------");

        System.out.println("Slice first from int");
        int num1 = input.nextInt();

        System.out.println("Slice second from int");
        int num2 = input.nextInt();

        System.out.println("Slice first from string");
        int num3 = input.nextInt();

        System.out.println("Slice second from string");
        int num4 = input.nextInt();

        if (num1 > num2 || num3 > num4) {
            System.out.println("Invalid indices for slicing string array.");
        }else{
            SliceArr(num1, num2, numbers);
            SliceArr(num3, num4, words);
            SliceArr(num1, numbers);
            SliceArr(num3, words);
        }

        

        input.close();
    }

    public static void printArray(int[] iarr, String[] sarr) {
        System.out.print("original int array: ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println("");

        System.out.print("original int array: ");
        for (int i = 0; i < sarr.length; i++) {
            System.out.print(sarr[i] + " ");
        }
        System.out.println("");

        
    }

    public static void SliceArr(int num1, int num2, int[] inum) {
    System.out.print("Slice from index " + num1 + " to " + num2 + ": [");
    for (int i = num1; i <= num2; i++) {
        System.out.print(inum[i]+" ");
    }
    System.out.println("]");
}
    public static void SliceArr(int num3, int num4, String[] inum) {
    System.out.print("Slice from index " + num3 + " to " + num4 + ": [");
    for (int i = num3; i <= num4; i++) {
        System.out.print(inum[i]+" ");
    }
    System.out.println("]");
}

    public static void SliceArr(int num1, int[] inum) {
    System.out.print("Slice from index " + num1 + " to end : [");
    for (int i = num1; i < inum.length; i++) {
        System.out.print(inum[i]);
        if (i < inum.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}
    public static void SliceArr(int num3, String[] inum) {
    System.out.print("Slice from index " + num3 + " to end : [");
    for (int i = num3; i < inum.length; i++) {
        System.out.print(inum[i]);
        if (i < inum.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}
}
