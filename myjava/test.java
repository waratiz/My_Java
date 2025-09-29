import java.util.Scanner;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int guess;

        System.out.println("Game Start! พิมพ์ 0 เพื่อจบเกม");

        while (true) {
            System.out.print("สุ่มเลขแล้ว! เดาว่าเลขอะไร (1-6): ");
            guess = input.nextInt();

            if (guess == 0) {
                System.out.println("End game");
                break;
            }

            int r = ran.nextInt(6) + 1; // สุ่ม 1-6

            if (guess == r) {
                System.out.println("เก่งมาก! คุณทายถูก");
            } else {
                System.out.println("ผิดจ้า เลขที่ออกคือ " + r);
            }
        }
        input.close();
    }
}