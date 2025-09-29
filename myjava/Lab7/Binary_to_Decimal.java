package Lab7;

import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter binary");
        String binary = input.next();
        int length = binary.length();

        int result = 0;
        int i = 0;

        while (i < length) {
            char num = binary.charAt(i);
            int value = num - '0'; // แปลงจาก char เป็น int
            int power = length - i - 1;

            int term = value * (int)Math.pow(2, power);
            System.out.println("(" + value + " x 2^" + power + ") = " + term);

            result += term;
            i++;
        }

        System.out.println("Decimal = " + result);
        input.close();
    }
}
