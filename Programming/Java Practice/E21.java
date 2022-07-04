import java.util.Scanner;

class E21{
    public static double a;
    public static int d;
    public void dollar(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any price");
        a = read.nextDouble();
        read.close();
        d = (int)(a);
        System.out.println("The dollar is " + d);
    }
    public void cents(){
        int c = (int)((a - d) * 100 + 0.5);
        System.out.println("The cent is " + c);
    }
    public static void main(String[] args) {
        E21 e = new E21();
        e.dollar();
        e.cents();
    }
}