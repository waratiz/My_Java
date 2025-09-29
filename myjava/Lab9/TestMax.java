package Lab9;

public class TestMax {
    /** Main method */
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int x = 9;
        int y = 7;
        int z = max(x, y); // Invoke max method
        int k = max(y, z);
        int m = max(z, k);

        System.out.println("The maximum between " + x +
                " and " + y + " is " + z);
    }

    /** Return the max between two numbers */
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result; // Return result
    }
}
