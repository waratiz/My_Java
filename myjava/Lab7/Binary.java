package Lab7;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = input.nextInt();

        String binary = "";

        int result = 0;

        if (num == 0) {
            binary = "0";

        } else {
            while (num > 0) {

                result = num % 2;
                binary = result + binary;
                num = num / 2;

            }

        }
        System.out.print("Binary: " + binary);

        input.close();

    }

}
