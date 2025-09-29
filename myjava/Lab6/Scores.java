package Lab6;
import java.util.Scanner;


public class Scores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter final exam score: ");
        int final_score =input.nextInt();

        System.out.println("Enter mid exam score: ");
        int mid_score =input.nextInt();

        System.out.println("Enter attendance percentage: ");
        int attendance =input.nextInt();

        

        if (final_score > 90 && attendance>= 95) {
            System.out.println("Pass with Distinction");
        }else {
            if(final_score>50 && (mid_score>40 || attendance>=80)){
                 System.out.println("Pass");
            }else{
                System.out.println("fail");
            }  
        }

        input.close();
    }
}
