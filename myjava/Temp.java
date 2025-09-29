import java.util.Scanner;;

public class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // var
        double temp;
        double celsius;
        double fahrenheit;
        String enter;
        boolean program = true;

        

        // operaterEnter the program or exit

        while (program) {

            // input
            System.out.println("Enter f to convert the temperature Fahrenheit to Celsius");
            System.out.println("Enter c to convert the temperature Fahrenheit to Celsius");
            System.out.println("Enter e to exit the program");
            enter = input.nextLine();


            if (enter.equalsIgnoreCase("e")) {
                program = false;
                System.out.println("Exiting program.");
                break;
            }


            // if f do equation
            if (enter.equalsIgnoreCase("f")){
                System.out.println("Enter Fahrenheit");
                fahrenheit = input.nextDouble();
                temp = (fahrenheit - 32) * 5 / 9;
                System.out.println("The temperature is "+ temp);
            }else if(enter.equalsIgnoreCase("c")){  // else c do equation
                System.out.println("Enter Celcious");
                celsius = input.nextDouble();
                temp = (celsius * 9 / 5) + 32;
                System.out.println("The temperature is "+ temp);
            }else{
                System.out.println("Error please enter only f,c or e");
            }
            System.out.println("");
        }
        input.close();
    }
}
