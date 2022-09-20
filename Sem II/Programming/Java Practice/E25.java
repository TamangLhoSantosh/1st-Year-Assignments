//importing Scanner class
import java.util.Scanner;

//class is declared as E25
class E25{

    //public variables are declared
    public static double a = 7.27;
    public static double b = 237.7;

    //method dewpoint is declared
    public void dewPoint(){

        //objected is created in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the temperature :");
        double temp = read.nextDouble();
        System.out.println("Enter the relative humidity :");
        double rh = read.nextDouble();
        read.close();

        double c = (((a * temp) / (b + temp)) + Math.log((rh)));
        double d = ((b * c) / (a - c));
        System.out.println(d);    
    }

    //main method is declared
    public static void main(String[] args) {

        //object is created and iitialized
        E25 e = new E25();

        //dewpoint method is called
        e.dewPoint();
    }
}