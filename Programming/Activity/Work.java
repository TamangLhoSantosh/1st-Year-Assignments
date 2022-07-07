//imporing scanner class
import java.util.Scanner;

//declaring class
public class Work{

    //condition function is declared
    public void condition( String name){

        //coditions are placed
        if (name.equalsIgnoreCase("BMW")){
            System.out.println("The car is expensive.");       
        }
    
        else if (name.equalsIgnoreCase("Centro")){
            System.out.println("The car is affoardable.");
        }
    
        else if (name.equalsIgnoreCase("Nano")){
           System.out.println("The car is cheap.");     
        }
    
        else {
            System.out.println("The car does not exists.");
        }

    }

    //main method is declared
    public static void main (String [] args){

        //object is created in scanner
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the name of the Car:");
        
        //reading data from console
        String name = read.nextLine();
        read.close();

        //creating and initializing new object
        Work work = new Work();

        //invoking condition
        work.condition(name);
    }
}