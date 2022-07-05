//importing Scanner class
import java.util.Scanner;

//E13 is declared as class
class E13{

//fun method is declared
    public void fun(String a){ 
        String b = a.substring(0,1) + " " + a.substring(1,2) + " " + a.substring(2,3) + " " + a.substring(3,4) + " " + a.substring(4,5);
        System.out.println(b);
    }

//main method is declared
    public static void main(String[] args) {

        //creating a new object in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any five digit number : ");
        String a = read.next();
        read.close();

        //creating new object and initializing the object
        E13 e = new E13();

        //invoking fun method
        e.fun(a);

    }
}