import java.util.Scanner;
 
class E16{
    public static int month;
    public static String name;
    public void Month(){
        name = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
        String a = name.substring((month - 1) * 9, month * 9);
        System.out.println(a);
    }
        public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        month = read.nextInt();
        read.close();
        E16 e = new E16();
        e.Month();
    }
}