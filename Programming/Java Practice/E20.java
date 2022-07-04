import java.util.Scanner;

class E20{
    public static String a;
    public void format(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your ten-digit phone number : ");
        a = read.next();
        read.close();
        String b = a.substring(0,3);
        String c = a.substring(3,6);
        String d = a.substring(6);
        System.out.println("(" +b + ")" + c + "-" + d);
    }
    public static void main(String[] args) {
        E20 e = new E20();
        e.format();
    }
}