//importing scanner class
import java.util.Scanner;

//declaring class as E2
public class E2{

    //declaring variables
    private int n, sum;

    //declaring constructor
    public E2(int num, int sum){
        n = num;
        this.sum = sum;
    }

    //set whole number
    public void setNum(int num){
        n = num;
    }

    //get whole number
    public int getNum(){
        return n;
    }

    //set sum
    public void setSum(int sum){
        this.sum = sum;
    }

    //get sum
    public int getSum(){
        return this.sum;
    }

    //declaring condition method
    public void condition(int num){

        //declaring conmditions
        if(num<0){
            System.out.println("Error number entered!!!");
        }
        else if (num == 1 || num == 0){
            System.out.println(num);
        }
        else {

            //declaring loop variable
            int i = 0;

            //declaring loop
            for(i, i <= num, ++i){
            
                int sum = sum + i;
            }
            System.out.println("The sum of the number from 1 to " + n + " is " + this.sum);
        }
    }

    //declaring main method
    public static void main(String[] args) {

        //creating object in scanner
        Scanner read = new Scanner(System.in);

        //reading data from console
        System.out.println("Enter any whole number : ");
        int num = read.nextInt();

        //closing read
        read.close();

        //creating new object
        E2 e = new E2(num, sum);
    }
}