//importing the scanner class
import java.util.Scanner;

//class is declared is E24
class E24{

    //resistance method is declared
    public void resistance(){

        //object is created in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the resistance r1 :");
        double r1 = read.nextDouble();
        System.out.println("Enter the resistance r2 :");
        double r2 = read.nextDouble();
        System.out.println("Enter the resistance r3 :");
        double r3 = read.nextDouble();
        read.close();

        double r = r1 + (Math.pow((1 / r2 + 1 / r3),-1));
        System.out.println("The resistance of the circuit is " + r);
    }
    
    //main method is declared
    public static void main(String[] args) {

        //object is created and initialized
        E24 e = new E24();

        //resistance method is called
        e.resistance();
    }
}