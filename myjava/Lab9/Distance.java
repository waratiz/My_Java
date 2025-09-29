package Lab9;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first distance x1");
        double distance1 = input.nextDouble();

        System.out.println("Enter first distance y1");
        double distance2 = input.nextDouble();

        System.out.println("Enter second distance x2");
        double distance3 = input.nextDouble();

        System.out.println("Enter second distance y2");
        double distance4 = input.nextDouble();

        

        System.out.println("The result is" + distance(distance1,distance2,distance3,distance4));

        input.close();
    }

    public static double distance(double x1,double y1,double x2, double y2){
        double result = 0;

        result = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y2-y1),2));

        return result;

}
        
    }
