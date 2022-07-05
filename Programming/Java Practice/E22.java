import java.util.Scanner;

public class E22{
    public void compound(int a, int b){
        System.out.println("Initial Balance: " + a);
        System.out.println("Annual interest rate in percentage : " + b);
        double c = b / 12;
        double d = a + c * a;
        System.out.println(c);
        System.out.println("After first month: " + d);
        double e = d + c * d;
        System.out.println("After second month: " + e);
        double f = e + c * e;  
        System.out.println("After third month: " + f);
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the amount : ");        
        int a = read.nextInt();
        System.out.println("Enter the interest per annum: ");
        int b = read.nextInt();
        read.close();
        E22 e = new E22();
        e.compound(a, b);
    }
}