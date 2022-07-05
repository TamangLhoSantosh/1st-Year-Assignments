
//impoting Scanner class
import java.util.Scanner;


//E10 is declared as class
class E10{
  
    //variable is declared
    public static String a;

    //comma method is declared
    public void comma(){
        int b = a.length();
        String c = a.substring(0,b-4);
        String d = a.substring(b-3);
        System.out.println(c + d);
    }

    //main method is declared
    public static void main(String[] args) {
  
        //creating new object in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter an integer between 1,000 and 999,999 : ");
        a = read.next();
        read.close();

        //creating object and initializing the object
         E10 e = new E10();
  
         //invoking comma function
         e.comma();
    }
}