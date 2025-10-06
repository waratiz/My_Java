package Lab12;
import java.util.Scanner;
public class Answer {
    
    public static void main(String[] args) {
      
        char[][] answers = { {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
     
        CheckAns(answers);
    }


    public static void CheckAns(char[][] stu){
        
        String[] Key = {"D","B","D","C","C","D","A","E","A","D"};

        
         System.out.println("\nResults:");
        for (int i = 0; i < stu.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < stu[i].length; j++) {
            if (stu[i][j] == Key[j].charAt(0)) {
                correctCount++;
            }
        }
            System.out.println("Student " + (i + 1) + " got " + correctCount + " correct.");
        }                    

    }
}
