//imoorting scaner class
import java.util.Scanner;
//declaring class discountcalculator
class DiscountCalculator{
    //decalring method discount
    public void discount(){
        //creating object in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of movie rentals : ");
        //decalring int data type that reads the data entered by the user from console
        int a = read.nextInt();
        System.out.println("Enter the number of members referred to the video club : ");
        //decalring int data type that reads the data entered by the user from console
        int b = read.nextInt();
        //closing the reading sequence
        read.close();
        //declaring int data type
        int c = a + b;
        // checking whether the give statement is true or not
        if (c < 76){
            System.out.println("The discount is equal to " + c + " percent.");
        }
        else{
            System.out.println("The discount is equal to 75 percent.");
        }
    }
    //declaring main function
    public static void main(String[] args) {
        // initializing object
        DiscountCalculator dc = new DiscountCalculator();
        //iunvoking dicoount methods
        dc.discount();
    }
}