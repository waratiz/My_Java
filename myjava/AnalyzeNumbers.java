public class AnalyzeNumbers {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double max = 0;
        double min =10000000;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            if (max < numbers[i]) {
                max = numbers[i];
            }

            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum is : "+max);
        System.out.println("Minimum is : "+min);
        input.close();
    }
}
