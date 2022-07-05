//immporting scanner class
import java.util.Scanner;

//class is declaared as E19
class E19{

    //public variable is declared
    public static int price;
    public static int numberOfBooks;

    //pricetotal method is decalred
    public void priceTotal(){

        //creating object in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the price of the book : ");
        price = read.nextInt();
        System.out.println("Enter the numbers of book : ");
        numberOfBooks = read.nextInt();
        read.close();
    }

    //method totalamount is declared
    public void totalAmount(){
        double tax = price * 7 /100;
        double shipping = 2 ;
        double total = (price + tax + shipping) * 2;
        System.out.println("The total cost of " + numberOfBooks + " books is " + total);
    }

    //main method is declared
    public static void main(String[] args) {

        //creating new object and intializing the object
        E19 e = new E19();

        //invoking pricetotal method
        e.priceTotal();

        //invoking totalamount method
        e.totalAmount();
    }
}