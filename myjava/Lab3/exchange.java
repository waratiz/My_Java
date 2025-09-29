package Lab3;
import java.util.Scanner;

public class exchange {
    public static void main(String[] args){

        double us;
        
        double exchange =31.8245;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you dollars");
        us = input.nextDouble();

        double thaibath = us*exchange;

        System.out.println("Your money is "+thaibath +"bTH");


    }
}
