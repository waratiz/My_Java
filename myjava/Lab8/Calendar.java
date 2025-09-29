package Lab8;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input ปี
        System.out.println("Enter the year:");
        int year = input.nextInt();

        // input วันเริ่มต้นของปี 1=Monday ... 7=Sunday
        System.out.println("Enter starting day of January (1-Monday to 7-Sunday):");
        int startDay = input.nextInt();

        // array เก็บชื่อเดือน
        String[] months = {"January","February","March","April","May","June",
                           "July","August","September","October","November","December"};

        // loop สำหรับเดือน 1–12
        for(int month = 1; month <= 12; month++) {
            String monthName = months[month - 1];

            // แสดงชื่อเดือนและปี
            System.out.println("\n\t\t" + monthName + " " + year);
            System.out.println("--------------------------------------------------");
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

            // จำนวนวันในเดือน
            int daysInMonth;
            switch(month) {
                case 2:
                    // ตรวจสอบ leap year
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
                default:
                    daysInMonth = 31;
                    break;
            }

            // พิมพ์ tab ก่อนวันแรก
            int tabs = startDay % 7; // Sunday = 0 tab
            for (int t = 1; t <= tabs; t++) {
                System.out.print("\t");
            }

            // พิมพ์วัน
            for(int day = 1; day <= daysInMonth; day++) {
                System.out.print(day + "\t");

                if ((day + tabs) % 7 == 0) {
                    System.out.println();
                }
            }

            // คำนวณ startDay ของเดือนถัดไป
            startDay = (startDay + daysInMonth) % 7;
            if (startDay == 0) startDay = 7; // Sunday = 7
        }

        input.close();
    }
}
