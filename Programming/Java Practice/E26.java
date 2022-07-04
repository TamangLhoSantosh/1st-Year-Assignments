import java.util.Scanner;

class E26{
    public static final int r1 = 1075;
    public static final int t1 = 85;
    public static final int b = 3969;
    public void thermistor(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the resistance : ");
        double r = read.nextDouble();
        read.close();
        double t = ((b * t1) / t1 * Math.log(r/  r1) + b) - 273;
        System.out.println("The liquid temperature is " + t);
    }
    public static void main(String[] args) {
        E26 e = new E26();
        e.thermistor();
    }
}