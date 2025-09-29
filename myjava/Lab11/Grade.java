package Lab11;

import java.util.Random;

import Lab7.Students;

public class Grade {
    public static void main(String[] args) {

        int student_A = 0;
        int student_B = 0;
        int student_C = 0;
        int student_D = 0;
        int student_F = 0;
        String Grade = "";
        int[] arr = new int[100];
        int i=0;
        for (; i < arr.length; i++) {

            int n = (int) (Math.random() * 101);

            if (n >= 80 && n <= 100) {
                Grade = "A";
                student_A++;

            } else if (n >= 70 && n <= 79) {
                Grade = "B";
                student_B++;

            } else if (n >= 60 && n <= 69) {
                Grade = "C";
                student_C++;

            } else if (n >= 50 && n <= 59) {
                Grade = "D";
                student_D++;

            } else {
                Grade = "F";
                student_F++;

            }
        }
        System.out.println("Student got A" + " >> " + student_A);
        System.out.println("Student got B" + " >> " + student_B);
        System.out.println("Student got C" + " >> " + student_C);
        System.out.println("Student got D" + " >> " + student_D);
        System.out.println("Student got F" + " >> " + student_F);
        System.out.println("Total students: "+i);
    }
}