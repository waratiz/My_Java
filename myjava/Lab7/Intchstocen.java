package Lab7;
class Intchstocen{
public static void main(String[] args){
    int num = 1;
    double cen =2.54;
    System.out.println("Intch              centimetres");
     System.out.println(num + "                     " +cen);
    while (num <200) {
        num+=1;
       
        if (num %2 ==0) {
            continue;
        }
        System.out.println(num+ "                     " +cen*num);
        
    }

    }
}