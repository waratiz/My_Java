package Lab7;
import java.util.Scanner;
public class Students {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int num_stu = input.nextInt();

        int i =0;
        int high_score =0;
        String name = "";

        while (i < num_stu) {
           
            System.out.println("Enter name of students");
            String name_stu = input.next();

            System.out.println("Enter score");
            int score_stu = input.nextInt();
            i++;

            if (score_stu > high_score) {
                high_score = score_stu;
                name = name_stu;
               
            }

           
        } System.out.println("High score: "+name + " " + high_score);

        input.close();
    }
   
}
