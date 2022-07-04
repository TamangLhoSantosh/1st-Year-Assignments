import java.util.Scanner;
class E19{
    public static int price;
    public static int numberOfBooks;
    public void priceTotal(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the price of the book : ");
        price = read.nextInt();
        System.out.println("Enter the numbers of book : ");
        numberOfBooks = read.nextInt();
        read.close();
    }
    public void totalAmount(){
        double tax = price * 7 /100;
        double shipping = 2 ;
        double total = (price + tax + shipping) * 2;
        System.out.println("The total cost of " + numberOfBooks + " books is " + total);
    }
    public static void main(String[] args) {
        E19 e = new E19();
        e.priceTotal();
        e.totalAmount();
    }
}