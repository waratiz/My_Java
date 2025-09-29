package Lab3;

import java.util.Scanner;

public class Timecalculate {
    public static void main(String[] args) {

        int Day = 86400;
        int Hours = 3600;
        int Minutes = 60;
        int Seconds;

        int D =0;
        int H =0;
        int M =0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter TIme(seconds)");
        Seconds = input.nextInt();

            D = Seconds / Day;
            Seconds -= D*Day;

            H = Seconds / Hours;
            Seconds -= H*Hours;

            M = Seconds / Minutes;
            Seconds -= M*Minutes; 

         System.out.print("Total is " + D + "Days " + H + "Hours " + M + "Minutes " + Seconds + "Seconds");
    }
}
