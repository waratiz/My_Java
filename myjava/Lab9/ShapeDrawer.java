import java.util.Scanner;

public class ShapeDrawer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a width: ");
        int width = input.nextInt();

        System.out.print("Enter a height: ");
        int height = input.nextInt();

        System.out.print("Enter a symbol:");
        char symbol = input.next().charAt(0);

        drawRectangle(width, height, symbol);

        input.close();
    }

    public static void drawRectangle(int width, int height, char symbol){
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                System.out.print(symbol);
            }
            System.out.println(symbol);
        }
    }
}
