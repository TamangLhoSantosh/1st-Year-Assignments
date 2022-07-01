import java.util.Scanner;
public class E4{
    public void add(double a, double b){
        double c = a + b;
        System.out.println("The addition of " + a + " and " + b + " is " + c);
    }
    public void sub(double a, double b){
        double d = a - b;
        System.out.println("The subtraction of " + a + " and " + b + " is " + d);
    }
    public void multi(double a, double b){
        double g = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is " + g);
    }
    public void avg(double a, double b){
        double f = (a + b) / 2;
        System.out.println("The average of " + a + " and " + b + " is " + f);
    }
    public void absolute(double a, double b){
        double c = Math.abs(a);
        double d = Math.abs(b);
        System.out.println(c);
        System.out.println(d);
    }
    public void math(double a, double b){
        double c = Math.max(a, b);
        System.out.println("The maximum number is " + c);
        double d = Math.min(a, b);
        System.out.println("The minimum number is " + d);
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any tow number : ");
        double a = read.nextDouble();
        double b = read.nextDouble();
        read.close();

        E4 e = new E4();
        e.add(a, b);
        e.sub(a, b);
        e.multi(a, b);
        e.avg(a, b);
        e.absolute(a, b);
        e.math(a, b);
    }
}