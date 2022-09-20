//importing scanner class
import java.util.Scanner;

//E9 is declared as class
class E9{
    //variables are declared
    public static String drive;
    public static String path;
    public static String fileName;
    public static String extension;

    //method fullPath is declared
    public void fullPath(){
        System.out.println(drive + ":" + path + "\\" + fileName + "." + extension);
    }

    //main method is declared
    public static void main(String[] args) {
  
        //creating new object in scanner
        Scanner read =new Scanner(System.in);
        System.out.println("Enter the dirve name : ");
        drive = read.next();
        System.out.println("Enter the path : ");
        path = read.next();
        System.out.println("Enter the file name : ");
        fileName = read.next();
        System.out.println("Enter the extrnsion of the file : ");
        extension = read.next();
        read.close();

        //creating new object and initializing the and object
        E9 e = new E9();
  
        //invoking fullPath method
        e.fullPath();
    }
}