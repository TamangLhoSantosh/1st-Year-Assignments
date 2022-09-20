//importing Scanner class
import java.util.Scanner;

//declaring E3 as a class
class E3{

    //declaring power method
    public void power(double a){

        //squaring the variable
        double b = Math.pow(a, 2);

        //cubing the variable
        double c = Math.pow(a, 3);

        // fourth power of variable
        double d = Math.pow(a, 4);

        //printing the results
        System.out.println("The square of the number is " + b);
        System.out.println("The cube of the number is " + c);
        System.out.println("The fourth power of the number is " + d);
    }


    //declaring main method
    public static void main(String[] args) {

        // creationg an object inn scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any number : ");

        //reading the input fromm console
        double a = read.nextDouble();
        read.close();

        // creating a new object and initializing
        E3 e = new E3();

        //invoking power method
        e.power(a);
    }
}