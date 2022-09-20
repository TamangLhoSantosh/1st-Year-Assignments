//importing scanner class
import java.util.Scanner;

//decalring an orchestrating class
public class AccountMain{

    /* declaring main method 
       reading data from console
       displaying all the data entered
    */
    public static void main(String[] args){
        
        //creating object in scanner class
        Scanner read = new Scanner(System.in);

        //declaring variable
        int i = 1;

        //creating loop that runs 3 times
        while(i <= 3){

             //reading data from console
            System.out.println("Enter account holder name : ");
            String name = read.nextLine();
            System.out.println("Enter account holder address : ");
            String address = read.nextLine();

           
            Account ac = new Account(name, address, 0, 10000, 1000);

            ac.showData();
            
            ++i;
        }


         //closing read
            read.close();

        //creating link between the classes
//        Account ac2 = new Account(name, address, 100, 200000, 2000);
  //      Account ac3 = new Account(name, address, 1000, 100000, 100); 
        
        //calling methods of Acccount here
//        ac2.showData();
  //      ac3.showData();
    }
}