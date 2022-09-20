//importing Scanner class
import java.util.Scanner;

//declaring class as E1
class E1{

    //declaring loop method
    public void loop(){


            //creating object in scanner
            Scanner scan = new Scanner(System.in);

            //declaring variable
            String c;

        //looping statement
        do{
            System.out.println(" ");
            System.out.println("Hey!!!");
            System.out.println(" ");
            System.out.println("Welcome To My Print Screen.");
            System.out.println(" ");
            System.out.println("Are You Enjoying Here???");
            System.out.println(" ");
            System.out.println("I Want To Tell You To Enjoy Your Life To Fullest....");
            System.out.println(" ");

            System.out.println("Do you want to continue? (Y / N) :");
            System.out.println(" ");

            //declarig loop inside a loop
            do{    
                c = scan.nextLine();

                //declaring condition
                if((c.equalsIgnoreCase("n")) || c.equalsIgnoreCase("y")){
                    break;
                }

                else{
                    System.out.println(" ");
                    System.out.print("Invalid character !!!");
                    System.out.println(" Please re-enter the character again.");
                    System.out.println(" ");
                }

            }while(!(c.equalsIgnoreCase("y")) || (c.equalsIgnoreCase("n")));
            
        } while (c.equalsIgnoreCase("y"));    //closing statement with looping value

        scan.close();

        System.out.println(" ");
        System.out.println("See You!");
        System.out.println(" ");

    }

    //declaring main method
    public static void main(String[] args){
        
        //object is created and initialized
        E1 e = new E1();
        
        //invoking loop method
        e.loop();
    }
} 