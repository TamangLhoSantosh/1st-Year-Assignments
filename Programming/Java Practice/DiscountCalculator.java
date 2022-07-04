import java.util.Scanner;

class DiscountCalculator{
    public void discount(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of movie rentals : ");
        int a = read.nextInt();
        System.out.println("Enter the number of members referred to the video club : ");
        int b = read.nextInt();
        int c = a + b;
        if (c < 76){
            System.out.println("The discount is equal to " + c + " percent.");
        }
        else{
            System.out.println("The discount is equal to 75 percent.");
        }
    }
    public static void main(String[] args) {
        DiscountCalculator dc = new DiscountCalculator();
        dc.discount();
    }
}