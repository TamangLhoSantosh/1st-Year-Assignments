//importing scanner class
import java.util.Scanner;

//class is declared as E26
class E26{

    //constants are declared
    public static final int r1 = 1075;
    public static final int t1 = 85;
    public static final int b = 3969;

    //method thermistor is declared
    public void thermistor(){

        //object is created in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the resistance : ");
        double r = read.nextDouble();
        read.close();
        
        double t = ((b * t1) / t1 * Math.log(r/  r1) + b) - 273;
        System.out.println("The liquid temperature is " + t);
    }

    //main method is declared
    public static void main(String[] args) {

        //object is created and initialized
        E26 e = new E26();

        //thermistor method is called
        e.thermistor();
    }
}