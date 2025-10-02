package Lab11;

public class ArrayPrinter {
    public static void main(String[] args) {

        int[] integerArray = {10, 20, 30, 40, 50};
        double[] doubleArray = {0.1, 9.3, 6.4, 5.0, 4.8};
        char[] chaArray = {'a','b','c','d','e'};
        String[] StringArray = {"Java", "is", "fun"};

        printArray(integerArray);
        printArray(doubleArray);
        printArray(chaArray);
        printArray(StringArray);
    }

public static void printArray(int[] arr){
    System.out.print("integerArray: ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }System.out.println("");
}
 public static void printArray(double[] arr){
     System.out.print("doubleArray: ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }System.out.println("");
 }
 public static void printArray(String[] arr){
    System.out.print("charArray: ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }System.out.println("");
 }
 public static void printArray(char[] arr){
        System.out.print("StringArray: ");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }System.out.println("");
 }
}
