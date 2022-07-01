import java.util.Scanner;

class E6{
    public void area(double r){
        double a = r;
        System.out.println("The area of the circle is " + a);
    }
    public void circumference(double r){
        double a = r;
        System.out.println("The circumference of the circle is" + a);
    }
    public void volume(double r){
        double a = r;
        System.out.println("The volume of the circle is " + a);
    }
    public void surface(double r){
        double a = r;
        System.out.println("The surface area of the circle is " + a);
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the radius :");
        double radius = read.nextDouble();
        read.close();
        
        E6 e = new E6();
        e.area(radius);
        e.circumference(radius);
        e.volume(radius);
        e.surface(radius);
    }
}