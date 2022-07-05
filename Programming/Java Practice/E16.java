//importing scanner class
import java.util.Scanner;
 
//class is declared
class E16{

    //declaring public variable
    public static int month;
    public static String name;

    //month method is declared
    public void Month(){
        name = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
        String a = name.substring((month - 1) * 9, month * 9);
        System.out.println(a);
    }

    //main method is declared
    public static void main(String[] args) {

        //new object is created in scanner
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        month = read.nextInt();
        read.close();

        //object is created and initialized
        E16 e = new E16();

        //invoking month method
        e.Month();
    }
}