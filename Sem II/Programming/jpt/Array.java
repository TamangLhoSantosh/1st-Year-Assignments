//declaring class name as aarcade
public class Arcade{

    //declaring constants
    static final int candyBar = 10;
    static final int gumBall = 3;

    //declaring variable
    int couponsWon;

    //declaring constructor
    public Arcade(int a){
        couponsWon = a;
    }

    //declaring method candy
    public void candy(int couponsWon){
        int candyGot = couponsWon / 10;
        System.out.println(candyGot);
    }

    //declaring gum method
    public void gum(int couponsWon){
        int rem = couponsWon % 10;
        int gumballGot = rem / 3;
        System.out.println(gumballGot);
    }

    //declaring main method
    public static void main(String[] args) {

        //initalizing variable
        int a = 26;

        //creating and initializing new object
        Arcade arc = new Arcade(a);

        //invoking method candy
        arc.candy(a);

        //invoking method gum
        arc.gum(a);
    }
}