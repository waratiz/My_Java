package Lab8;

public class Pyramid {
    public static void main(String[] args) {

        int rows = 8; 

        for (int i = 1; i <= rows; i++) {
            
            for (int space = rows - i; space > 0; space--) {
                System.out.printf("\t "); 
            }

            
            int val = 1;
            for (int k = 1; k <= i; k++) {
                System.out.printf("%d\t ",val);
                val *= 2; 
            }

            
            val /= 2; 
            for (int k = i - 1; k >= 1; k--) {
                val /= 2;
                System.out.printf("%d\t ",val);
            }

            System.out.println();
        }
    }
}
