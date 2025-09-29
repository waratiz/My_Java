package Lab8;

public class Leap_years {
    public static void main(String[] args) {
        int leap = 0;
        int line = 0;
        int total = 0;

        for (int i = 101; i < 2100; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                leap = i;
                System.out.print(leap + " ");
                line++;
                total++;

                if (line % 10 == 0) {  
                    System.out.print("\n");
                }
            }
        }

        System.out.println("\nTotal is " + total);
    }
}
