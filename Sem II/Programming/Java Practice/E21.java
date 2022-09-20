//importing scanner class
import java.util.Scanner;

//class os declared as E21
class E21{

    //public variable is declared
    public static double a;
    public static int d;

    //dollar method is declared
    public void dollar(){

        //object is created in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any price");
        a = read.nextDouble();
        read.close();
        d = (int)(a);
        System.out.println("The dollar is " + d);
    }

    //method cents is declared
    public void cents(){
        int c = (int)((a - d) * 100 + 0.5);
        System.out.println("The cent is " + c);
    }

    //main method is declared
    public static void main(String[] args) {

        //creating new object and initializing the object
        E21 e = new E21();

        //invoking dollar method
        e.dollar();
        
        //invoking cents method
        e.cents();
    }
}