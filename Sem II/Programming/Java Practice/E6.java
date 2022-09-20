//improrting scanner class
import java.util.Scanner;

//decalring E6 as class
class E6{

    //declaring constant
    public static final double PI = 3.1415;

    //declaring area method
    public void area(double r){
        double a = PI * Math.pow(r, 2);
        System.out.println("The area of the circle is " + a);
    }

    //declaring circumference method
    public void circumference(double r){
        double a = 2 * PI * r;
        System.out.println("The circumference of the circle is" + a);
    }
    
    //declaring volume method
    public void volume(double r){
        double a = (4 * PI * Math.pow(r, 3)) / 3;
        System.out.println("The volume of the circle is " + a);
    }
    
    //declaring surface method
    public void surface(double r){
        double a = PI * Math.pow(r,2);
        System.out.println("The surface area of the circle is " + a);
    }
    //declaring main method
    public static void main(String[] args){
 
        //creating new object in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the radius :");
        double radius = read.nextDouble();
        read.close();
        
        //creating new object and initializing
        E6 e = new E6();
 
        //invoking area method
        e.area(radius);
 
        //invoking circumference method
        e.circumference(radius);
 
        //invoking vpolume method
        e.volume(radius);
 
        //invoking surface method
        e.surface(radius);
    }
}