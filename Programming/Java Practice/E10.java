import java.util.Scanner;

class E10{
    public static String a;
    public void comma(){
        int b = a.length();
        String c = a.substring(0,b-4);
        String d = a.substring(b-3);
        System.out.println(c + d);
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter an integer between 1,000 and 999,999 : ");
        a = read.next();
        read.close();
         E10 e = new E10();
         e.comma();
    }
}