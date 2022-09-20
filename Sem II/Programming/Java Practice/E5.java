//improting Scanner class
import java.util.Scanner;

//declaring E5 as class
class E5{

    //defining contants
    public static final double MTMI = 0.000621371;
    public static final double MTF = 3.28084;
    public static final double MTI = 39.3701;

    //declaring miles method
    public void miles(double a){
        double b = a * MTMI;
        System.out.println("The distance in mile is " + b);
    }

    //declaring feet method
    public void feet(double a){
        double b = a * MTF;
        System.out.println("The distance in foot is " + b);
    }
    
    //declaring inches method
    public void inches(double a){
        double b = a * MTI;
        System.out.println("The distance in inches is " + b);
    }
    
    //declaring main method
    public static void main(String[] args) {

        //creating new object in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter measurement in meter : ");
        double a = read.nextDouble();
        read.close();

        //creating new object and initializing the object
        E5 e = new E5();

        //invoking miles method
        e.miles(a);

        //invoking feet method
        e.feet(a);

        //invoking inches method
        e.inches(a);
    }
}