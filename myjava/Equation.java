import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        //define variable with  meaningful names
        double OrbitalVelocity;
        final double gravity =6.67430e-11;
        double mass;
        double distance;


        //input from users
        System.out.println("Enter mass(in kilograms)");
        mass = input.nextDouble();
        System.out.println("Enter distance(in meters)");
        distance = input.nextDouble();


        //process 
        if ((mass > 0 && distance > 0)) { // Validate that mass and distance are positive values
            OrbitalVelocity = Math.sqrt((gravity*mass)/distance); // equation to calculater orbital velocity


            //output m/s
            System.out.println("-------------Results------------------");
            System.out.println("The velocity is: " + OrbitalVelocity + " m/s");

            //output km/s
            double OrbitalVelocityToKm;
            OrbitalVelocityToKm = OrbitalVelocity /1000;
            System.out.printf("Which is equivalent to: %.2f km/s",OrbitalVelocityToKm );

        }else{ 
            System.out.println("Error please try again");
        }
        
        

        
        input.close();
    }
}
