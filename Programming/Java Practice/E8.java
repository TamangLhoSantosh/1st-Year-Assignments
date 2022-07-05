// importing Scanner class
import java.util.Scanner;

//E8 is declared as class
class E8{
 
    //public variable is declare
    public static double fuelInTank;
    public static double efficiency;
    public static double petrolPrice;

    //costFor100Mile method is declared
    public void costFor100Mile(){

        //Creating new object in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the fuel in tank : ");
        fuelInTank = read.nextDouble();
        System.out.println("Enter the fuel efficiency of the car : ");
        efficiency = read.nextDouble();
        System.out.println("Enter the fuel price : ");
        petrolPrice = read.nextDouble();
        read.close();

        //mathematical calculation
        double costFor1Mile = efficiency * petrolPrice;
        double costFor100Mile = costFor1Mile * 100;

        //printing the obtained result
        System.out.println("The cost per 100 miles is Rs. " + costFor100Mile);
    }

    //declaring distance method
    public void distance(){

        //maathematical calculation
        double d = fuelInTank * efficiency / 100;
  
        //printing the obtianed result
        System.out.println("The diaatance travlled by the vechile with the fuel in its tank is " + d + " miles.");
    }

    //declaring main method
    public static void main(String[] args) {
  
        //creaating new object and initializing the object
        E8 e = new E8();
  
        //invoking costFor100Miles method
        e.costFor100Mile();
  
        //invoking distance method
        e.distance();
    }
}