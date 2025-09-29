package Lab8;

public class Initial {
    public static void main(String[] args) {
        double num = 1000;
        double interest_rate = 0.01; // 1% ต่อเดือน
        int total_month = 0;

        // ใช้ for loop เดือนต่อเดือน
        for (total_month = 0; num < 1000000; total_month++) {
            num += num * interest_rate;
        }

        int years = total_month / 12;
        int months = total_month % 12;

        System.out.printf("ยอดเงินสุดท้าย: %.2f%n", num);
        System.out.println("ใช้เวลา: " + years + " ปี " + months + " เดือน");
    }
}
