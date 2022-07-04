import java.util.Scanner;

class E8{
    public static double fuelInTank;
    public static double efficiency;
    public static double petrolPrice;

    public void costFor100Mile(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the fuel in tank : ");
        fuelInTank = read.nextDouble();
        System.out.println("Enter the fuel efficiency of the car : ");
        efficiency = read.nextDouble();
        System.out.println("Enter the fuel price : ");
        petrolPrice = read.nextDouble();
        read.close();
        double costFor1Mile = efficiency * petrolPrice;
        double costFor100Mile = costFor1Mile * 100;
        System.out.println("The cost per 100 miles is Rs. " + costFor100Mile);
    }
    public void distance(){
        double d = fuelInTank * efficiency / 100;
        System.out.println("The diaatance travlled by the vechile with the fuel in its tank is " + d + " miles.");
    }
    public static void main(String[] args) {
        E8 e = new E8();
        e.costFor100Mile();
        e.distance();
    }
}