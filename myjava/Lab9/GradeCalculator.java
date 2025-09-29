import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String condition = "yes";
        int all_credit =0;
        double final_gpa =0;


        while (condition.equalsIgnoreCase("yes")) {

            if (condition.equalsIgnoreCase("no")) {
                break;
            }

            System.out.print("Enter the subject name: ");
            String subject = input.nextLine();

            System.out.print("Enter subject credit: ");
            int credit = input.nextInt();
            all_credit = all_credit+credit;

            System.out.print("Enter your Score 0-100 :");
            int score = input.nextInt();
            input.nextLine();

            System.out.printf("Your grade is:\t%s | GPA:\t%.1f \n", calscore(score), getGpa(score));
            final_gpa += getGpa(score)*credit;

            System.out.print("Add another subject? (yes/no) : ");
            condition = input.nextLine();
            
        }
        final_gpa = final_gpa/all_credit;

        System.out.println("--------------------------");
        System.out.println("Calculating final GPA . . .");
        System.out.println("Total credit is : "+all_credit);
        System.out.println("Your final GPA is : "+final_gpa);

        input.close();
    }

    public static String calscore(int score) {
        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            grade = "D";
        } else if (score >= 0 && score <= 50) {
            grade = "F";
        } else {
            System.out.println("invalid please enter 0-100");
            return "Invalid Score";
        }

        return grade;
    }

    public static double getGpa(int score) {
        double GPA;

        if (score >= 90 && score <= 100) {
            GPA = 4;
        } else if (score >= 80 && score <= 89) {
            GPA = 3;
        } else if (score >= 70 && score <= 79) {
            GPA = 2;
        } else if (score >= 60 && score <= 69) {
            GPA = 1;
        } else if (score >= 0 && score <= 50) {
            GPA = 0;
        } else {
            GPA = -1;
        }

        return GPA;
    }
}
