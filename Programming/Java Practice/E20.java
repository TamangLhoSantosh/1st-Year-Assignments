//importing scanner class
import java.util.Scanner;

//calss is declared as E20
class E20{
    //public variable is declared
    public static String a;

    //format method is declared
    public void format(){

        //new object is declared in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your ten-digit phone number : ");
        a = read.next();
        read.close();
        String b = a.substring(0,3);
        String c = a.substring(3,6);
        String d = a.substring(6);
        System.out.println("(" +b + ")" + c + "-" + d);
    }

    //main method is declared
    public static void main(String[] args) {

        //new object is created and initializec
        E20 e = new E20();

        //invoking formating is called
        e.format();
    }
}