package Lab3;
import java.util.Scanner;

//----------Lab 3
//----------(Student name and Id.)
//This program for calculate the area of regtangle
public class Rectangle {
    public static void main(String[] args) {
double length;
double width;
double area;
Scanner input = new Scanner(System.in);
System.out.print("Enter length:");
length = input.nextDouble();
System.out.print("Enter width:");
width = input.nextDouble();
area = length*width;
System.out.println("The area of regtangle is "+area);
}
}