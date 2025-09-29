package Lab8;

public class Table {
    public static void main(String[] args) {

        double kilo = 1;
        double pounds = 2.2;
        double P = 20;
        double K = 9.09;
        double pound_to_kilo = 0;
        double kilo_to_pounds = 0;

        System.out.printf("Kilograms\tPounds\t|\tPounds\tKilograms%n");
        System.out.printf("%.0f\t\t%.1f\t|\t%.0f\t\t%.1f", kilo, pounds, P, K);
        System.out.println("\n");
        for (; kilo <= 199; kilo +=2) {
            System.out.printf("%.0f\t\t%.1f\t|\t%.0f\t\t%.1f", kilo, kilo_to_pounds, P, pound_to_kilo);
            System.out.println("\n");
            kilo_to_pounds = kilo * pounds;
            P += 5;
            pound_to_kilo = P * K;

        }

    }
}
