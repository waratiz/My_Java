package Lab6;
import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

        System.out.println("Enter the input");
        int num= input.nextInt();

        if (num <90 && num >0) {
            System.out.println("Quadrant 1");
        }else if (num > 90 && num < 180) {
            System.out.println("Quadrant 2");
        }else if (num > 180 && num < 270){
            System.out.println("Quadrant 3");
        }else if (num > 270 && num < 360){
            System.out.println("Quadrant 4");
        }else {
            System.out.println("not reside in any quadrant");
            }


         input.close();    
        }

       
    }

