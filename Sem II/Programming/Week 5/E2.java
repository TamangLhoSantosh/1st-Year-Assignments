//importing scanner
import java.util.Scanner;

//declaring E2 as class
public class E2{

    //declaring loop method
    public double loop(double n){
        int i;
        int sum = 0;
        for(i = 0; i <= n; ++i){
            sum = sum + i;
        }
        return sum;
    }
    //declaring condition method
    public void condition(double n){
        if(n == 0){
            System.out.println("Error number!!!");
        }
        else if(n == 1 || n == 0){
            System.out.println(n);
        }
        else{
            System.out.println("The sum is " + loop(n));
        }
    }

    //declaring main method
    public static void main(String[] args) {

        //creating object in scanner
        Scanner read = new Scanner(System.in);

        //Reading data from console
        System.out.println("Enter any whole number : ");
        double n = read.nextInt();

        //closing read
        read.close();

       //declaring new object
        E2 e = new E2();

        //invoking condition method
        e.condition(n);   
    }
}