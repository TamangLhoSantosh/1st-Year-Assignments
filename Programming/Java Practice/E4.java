//importing Scanner class
import java.util.Scanner;

//declaring E4 as 
public class E4{
    
    //declaring add method
    public void add(double a, double b){
 
        //mathematical calculation
        double c = a + b;
 
        //printing the result
        System.out.println("The addition of " + a + " and " + b + " is " + c);
    }

    //declaring dub method
    public void sub(double a, double b){
 
        //mathematical calculation
        double d = a - b;
 
        //printing the result
        System.out.println("The subtraction of " + a + " and " + b + " is " + d);
    }

    //declaring multi method
    public void multi(double a, double b){
 
        //mathematical calculation
        double g = a * b;
 
        //printing the result
        System.out.println("The multiplication of " + a + " and " + b + " is " + g);
    }

    //declaring avg method
    public void avg(double a, double b){
 
        //mathematical calculation
        double f = (a + b) / 2;
 
        //printing the result
        System.out.println("The average of " + a + " and " + b + " is " + f);
    }

    //declaring absolute method where the absolute value of the variables are printed
    public void absolute(double a, double b){
        double c = Math.abs(a);
        double d = Math.abs(b);
        System.out.println(c);
        System.out.println(d);
    }

    //declaring math method where the maximum and minimum value are printed
    public void math(double a, double b){
        double c = Math.max(a, b);
        System.out.println("The maximum number is " + c);
        double d = Math.min(a, b);
        System.out.println("The minimum number is " + d);
    }

    //main method is declared
    public static void main(String[] args) {

        //creating new object in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any tow number : ");

        //Read the data from the console
        double a = read.nextDouble();
        double b = read.nextDouble();
        read.close();

        //creating an object and initializing object
        E4 e = new E4();
 
        //invoking add method
        e.add(a, b);
 
        //invoking sub method
        e.sub(a, b);
 
        //invoking multi method
        e.multi(a, b);
 
        //invoking avg method
        e.avg(a, b);
 
        //invoking absolute method
        e.absolute(a, b);
 
        //invoking math method
        e.math(a, b);
    }
}