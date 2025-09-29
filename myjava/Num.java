import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;


        System.out.println("Enter first number");
        num1 = input.nextInt();

        System.out.println("Enter second number");
        num2 = input.nextInt();

        if (num1 > num2){
            System.out.println("The first number is greater than the second.");
        }else if (num1 < num2){
            System.out.println("The first number is no greater than the second.");
        }else{
            System.out.println("These two number are equal.");
        }



        input.close();
    }
}
