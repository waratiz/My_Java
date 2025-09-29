package Lab10;
import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side of square:");
        int side = input.nextInt();

        System.out.println("Enter length and width of rectangle:");
        double length = input.nextDouble();
        double width = input.nextDouble();

        System.out.println("Enter radius of circle:");
        double radius = input.nextDouble();


        calculateArea(side);                    
        calculateArea(length, width);                      
        calculateArea(radius);  

        input.close();
    }

    public static void calculateArea(int side){
        System.out.println("Area wide side"+side+":"+ side*side);
    }

    public static void calculateArea(double length, double width){
        System.out.println("Area rectangle length :"+length+ "and"+width+":"+ length*width);
    }

    public static void calculateArea(double radius){
        System.out.println("Area of circle with radius" +radius +":"+ Math.PI*Math.pow(radius, 2));
    }
}
