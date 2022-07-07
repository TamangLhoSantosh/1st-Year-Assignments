//importing scanner class
import java.util.Scanner;

//declaring class
public class Operations{

    //decalring variavble
    String symbols;
    int a, b;

    //readsymbol method is declared
    public void readSymbol(String symbols){

        //creating object in scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any mathematical symbols : ");
        symbols = scan.nextLine();
        scan.close();
    }

    //add method is declared
    public void add(int a, int b){
        int c = a + b;
        System.out.println("Enter the addition of the entered two numbers is " + c);
    }

    //sub method is declared
    public void sub(int a, int b){
        int c = a - b;
        System.out.println("Enter the subtrsction of the entered two numbers is " + c);
    }

    //multi method is declared
    public void multi(int a, int b){
        int c = a * b;
        System.out.println("Enter the multiplication of the entered two numbers is " + c);
    }

    //divide method is declared
    public void divide(int a, int b){
        int c = a / b;
        System.out.println("Enter the division of the entered two numbers is " + c);
    }

    //decalring calculation method
    public void calculation(String symbols){


        //conditions are decalred
        if (symbols.equals("+")){

            //add method is invoked
            cal.add(c, d);
        }

        else if (symbols.equals("-")){
        
            //sub method is invoked
            cal.sub(c, d);
        }
        else if (symbols.equals("*")){

            //multi method is invoked
            cal.multi(c, d);
        }

        else if (symbols.equals("/")){

            //divide method is invoked
            cal.divide(c, d);
        }
    }

    //main method is declared
    public static void main(String[] args) {

        //creatinfg object inad initializing the object
        Operations op = new Operations();
        
        //invoking readinfo method
        op.readInfo(a, b);

        //invoking readsymbol method
        op.readSymbol(symbols);

        //invoking loop method
        op.calculation(symbols, a, b);
    }
}