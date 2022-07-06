//importing Scanner class
import java.util.Scanner;

//declaring class as E1
class E1{

    //declaring loop method
    public void loop(){


            //creating object in scanner
            Scanner scan = new Scanner(System.in);

            String c;

        //looping statement
        do{
            System.out.println("sfhsdufuhjsdfdsghjsgdshdsjdshj");
            System.out.println("sfghfghfghgjfgdrgdrgsrdhftgfhg");
            System.out.println("sdfdsfdgfshhfghfghghghgjhgjghj");
            System.out.println("dsfgfhfghgfjggfhfhgfghfhfhfhgh");

            System.out.println("Do you want to continue? (Y / N) :");
            c = scan.nextLine();
            
        } while (c.equals("y") || c.equals("Y"));    //closing statement with looping value

        scan.close();
        System.out.println("See You!");

    }

    //declaring main method
    public static void main(String[] args){
        
        //object is created and initialized
        E1 e = new E1();
        
        //invoking loop method
        e.loop();
    }
} 