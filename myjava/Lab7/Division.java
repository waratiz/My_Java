package Lab7;

import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();

        int i=0;
        int count=0;

        while (i < num) {
            i++;
            if ((i % 5 == 0 || i % 7 == 0) && !(i % 5 == 0 && i % 7 == 0)){
                count++;
                 System.out.print(i+" ");
                 if (count%10 ==0) {
                    System.out.println();
                 }
            }else{
               continue;
            }
           

        }System.out.println("\n");
        System.out.println("End of number.");

        input.close();
    }
}
