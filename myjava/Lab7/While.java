package Lab7;

class WhileLoopExample {
    public static void main(String args[]) {
        int i = 1;
        while (i < 101) {
            System.out.print(" " + i);
            i++;

            if (i%10 ==1) {
                System.out.println( );
                
            }
        }
    }
}
