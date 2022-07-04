import java.util.Scanner;

class E25{
    public static double a = 7.27;
    public static double b = 237.7;
    public void dewPoint(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the temperature :");
        double temp = read.nextDouble();
        System.out.println("Enter the relative humidity :");
        double rh = read.nextDouble();
        read.close();
        double c = (((a * temp) / (b + temp)) + Math.log((rh)));
        double d = ((b * c) / (a - c));
        System.out.println(d);
        
    }
    public static void main(String[] args) {
        E25 e = new E25();
        e.dewPoint();
    }
}