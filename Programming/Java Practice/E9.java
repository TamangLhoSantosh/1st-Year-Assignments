import java.util.Scanner;

class E9{
    public static String drive;
    public static String path;
    public static String fileName;
    public static String extension;
    public void fullPath(){
        System.out.println(drive + ":" + path + "\\" + fileName + "." + extension);
    }

    public static void main(String[] args) {
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
        E9 e = new E9();
        e.fullPath();
    }
}