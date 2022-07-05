//importing scanner class
import java.util.Scanner;

//class is declared as E18
class E18{

    //public variable is declared
    public static int y;

    //mehtod easter is declared
    public void easter(){

        //creating new object in scanner
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the year : ");
        y = read.nextInt();
        read.close();

        //mathematical calculation
        int a = y % 9;
        int b = y / 100;
        int c = y % 100;
        int d = b / 4;
        int e = b % 4;
        int g = (8 * b + 13) / 25;
        int h = (19 * a + b - d - g + 15) / 30;
        int j = c / 4;
        int k = c % 4;
        int m = (a + 11 * h) / 319;
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        int n = (h - m + r + 90) / 25;
        int p = (h - m + r + n + 19) % 32;
        System.out.println("The easter month is " + n);
        System.out.println("The easter day is " + p);
    }

    //main method is declared
    public static void main(String[] args) {
        
        //creating new object and initializing the object
        E18 e  = new E18();

        //method easter is invoked
        e.easter();
    }
}