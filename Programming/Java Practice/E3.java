import java.util.Scanner;

class E3{
    public void power(double a){
        double b = Math.pow(a, 2);
        double c = Math.pow(a, 3);
        double d = Math.pow(a, 4);
        System.out.println("The square of the number is " + b);
        System.out.println("The cube of the number is " + c);
        System.out.println("The fourth power of the number is " + d);

    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any number : ");
        double a = read.nextDouble();
        read.close();

        E3 e = new E3();
        e.power(a);
    }
}