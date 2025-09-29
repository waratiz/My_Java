package Lab3;
import java.util.Scanner;

public class VOLUME {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double length;
        double volume;
        double area;
        double pie = 3.1428;

        System.out.println("Enter radius");
        radius = input.nextDouble();

        System.out.println("Enter length");
        length = input.nextDouble();

        area = radius*radius*pie;
        volume = area*length;

        System.out.println("The area is" + area);
        System.out.println("THe voulme is" + volume);

     }
}
