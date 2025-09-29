import java.util.Scanner;


public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hours;
        double salary;

         System.out.println("Enter hours worked");
         hours = input.nextInt();

         if (hours <= 40){
            salary = hours*8;
            System.out.println("You got:" + "$" + salary );
         }else{
            salary = 320 + 12*(hours%40);
            System.out.println("You got:" + "$" + salary );
         }



         input.close();
    }
}
