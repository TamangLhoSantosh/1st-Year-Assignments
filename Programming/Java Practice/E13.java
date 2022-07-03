import java.util.Scanner;
class E13{
    public void fun(String a){ 
        String b = a.substring(0,1) + " " + a.substring(1,2) + " " + a.substring(2,3) + " " + a.substring(3,4) + " " + a.substring(4,5);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any five digit number : ");
        String a = read.next();
        read.close();

        E13 e = new E13();
        e.fun(a);

    }
}