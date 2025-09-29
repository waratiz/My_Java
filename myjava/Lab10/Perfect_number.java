package Lab10;
import java.util.Scanner;
public class Perfect_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();

        isPerfect(num);

    }

    public static void isPerfect(int number){

        int sum=0;
        boolean test;

        for(int i =1;i<number;i++){
            if (number%i ==0) {
                sum+=i;
            }
        }

        if (sum == number) {
           test =true;
           System.out.println(number+" is a perfect number");
        }else{
            test = false;
            System.out.println(number+" is not a perfect number");
        }


    }
}