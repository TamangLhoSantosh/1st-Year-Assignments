//importing Scanner class
import java.util.Scanner;

//declaring class as Student
class Student{
    // declaring variables
    int id;
    String name;
    String level;

    Scanner s;

    public Student(String name, int id, String level){
        this.id = id;
        this.level = level;
        this.name = name;
        this.initialise();
    }
    public void initialise(){
        s = new Scanner(System.in);
    }

    public String getName(){
        return name;
    }

    public String getLevel(){
        return level;
    }

    public int getID(){
        return id;
    }

    public double marks(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks of five subjects : ");
        double m1 = scan.nextDouble();
        double m2 = scan.nextDouble();        
        double m3 = scan.nextDouble();        
        double m4 = scan.nextDouble();        
        double m5 = scan.nextDouble();
        scan.close();
        double avg = (m1 + m2 + m3 + m4 + m5) / 5;
        return avg;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student name : ");
        String name = s.nextLine();
        System.out.println("Enter student level : ");
        String level = s.nextLine();
        System.out.println("Enter student id : ");
        int id = s.nextInt();
        s.close();
        Student stf = new Student(name, id, level);
        System.out.println(stf.getName() + " studying in " + stf.getLevel() + " with id no. " + stf.getID() + " got the average marks of " + stf.marks());
    }
}