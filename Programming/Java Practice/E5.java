import java.util.Scanner;

class E5{
    public static final double MTMI = 0.000621371;
    public static final double MTF = 3.28084;
    public static final double MTI = 39.3701;

    public void miles(double a){
        double b = a * MTMI;
        System.out.println("The distance in mile is " + b);
    }
    public void feet(double a){
        double b = a * MTF;
        System.out.println("The distance in foot is " + b);
    }
    public void inches(double a){
        double b = a * MTI;
        System.out.println("The distance in inches is " + b);
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter measurement in meter : ");
        double a = read.nextDouble();
        read.close();

        E5 e = new E5();
        e.miles(a);
        e.feet(a);
        e.inches(a);
    }
}