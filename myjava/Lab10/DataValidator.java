package Lab10;

public class DataValidator {
    public static boolean isValid(String name) {
        boolean condition = false;

        if (name == null ) {
            condition = false;
        }else if (name.length()<1) {
            condition = false;
        }else{
            condition = true;
        }
        

        return condition;
    }

    public static boolean isValid(int num) {
        boolean condition = false;
        if (num >=18 && num <=120) {
            condition = true;
        }
        return condition;
    }

    public static boolean isValid(String pass, int length) {
        boolean condition =false;

        if (pass == null){
            condition = false;
        }else if (pass.length()> length) {
            condition = true;
        }else{
            condition = false;
        }


        return condition;
    }
}

