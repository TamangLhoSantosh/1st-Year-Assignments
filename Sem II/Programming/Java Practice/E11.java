//importing scanner class
import java.util.Scanner;

//declaring E11 as class
class E11{
 
    //declaring public variable
    public static String a;
    
    //declaring comma as class
    public void comma(){
        int b = a.length();
        String c = a.substring(0,b-3);
        String d = a.substring(b-3);
        System.out.println(c + "," + d);
    }

    //declaring main method
    public static void main(String[] args) {
 
        //creatin new object in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter an integer between 1,000 and 999,999 : ");
        a = read.next();
        read.close();

        //creating object and initializing the object
         E11 e = new E11();
 
         // invoking comma method
         e.comma();
    }
}