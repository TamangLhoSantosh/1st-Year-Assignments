//importing scanner class
import java.util.Scanner;

//declaaring class sdf
class Sdf{

    //declaring variables
    public static int a;
    public static int b;
    public static String c;

    //declaring sdf method
    public void sdf(String c, int a, int b){

        //applying condition
        if (c.equals("+")){
            System.out.println( a + b );
        }

        else if (c.equals("-")){
            System.out.println( a - b );
        }
        else if (c.equals("*")){
            System.out.println( a * b );
        }
        else if (c.equals("/")){
            System.out.println( a / b );
        }
        else {
            System.out.println("Invalid symbol");
        }
    }

    //declaring main method
    public static void main(String[] args) {

        //creating object in scanner
        Scanner scan = new Scanner(System.in);

        //reading data from console
        System.out.println("Enter any mathematical symbols : ");
        String c = scan.nextLine();
        System.out.println("Enter any integer : ");
        int a = scan.nextInt();
        System.out.println("Enter another integer : ");
        int b = scan.nextInt();

        scan.close();

        //object creation and initialization
        Sdf sd = new Sdf();

        //invoking sdf method
        sd.sdf(c, a, b);

    }
}