package Lab5;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double first_sides;
        double second_sides;
        double third_sides;


        System.out.println("Enter first sides");
        first_sides = input.nextDouble();

        System.out.println("Enter second sides");
        second_sides = input.nextDouble();

        
        System.out.println("Enter third sides");
        third_sides = input.nextDouble();

        if ((first_sides+second_sides)>third_sides && ((first_sides+third_sides)>second_sides) && ((second_sides+third_sides)>first_sides))  {  //Validity Check
            


            if ((first_sides == second_sides) && (first_sides == third_sides) && (second_sides == third_sides)) {    //Classification
                System.out.println("The sides form a Equilateral triangle.");  
            }else if ((first_sides == second_sides)|| (first_sides == third_sides) || (second_sides == third_sides)) {
                System.out.println("The sides form a Isosceles triangle.");
            }else{
                System.out.println("The sides form a Scalene triangle.");
            }



        }else{
            System.out.println("These sides cannot form a valid triangle.");
        }


        input.close();
    }
    
}
