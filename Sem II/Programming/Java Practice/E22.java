//importing scanner class
import java.util.Scanner;

//class is declared as E22
public class E22{

    //compound method is declared
    public void compound(int a, int b){
        System.out.println("Initial Balance: " + a);
        System.out.println("Annual interest rate in percentage : " + b);
        double c = b / 12;
        double d = a + c * a;
        System.out.println(c);
        System.out.println("After first month: " + d);
        double e = d + c * d;
        System.out.println("After second month: " + e);
        double f = e + c * e;  
        System.out.println("After third month: " + f);
    }

    //main method is declared
    public static void main(String[] args){

        //creatig new object n scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the amount : ");        
        int a = read.nextInt();
        System.out.println("Enter the interest per annum: ");
        int b = read.nextInt();
        read.close();

        //object is created and initialized
        E22 e = new E22();

        //compound method is invoked
        e.compound(a, b);
    }
}