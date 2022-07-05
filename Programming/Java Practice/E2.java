// declaring E2 as class
class E2{
    //declaring perimeter method
    public void perimeter(double a, double b){
        double pm = 2 * (a + b);
        System.out.println("The perimeter is " + pm);
    }
    //declaring length method
    public void length(double a, double b){
        if (a > b)
        System.out.println("The length is " + a);
        else
        System.out.println("The length is " + b);
    }
    //declaring main method
    public static void main(String[] args) {
        //creating new object and initializing object
        E2 p = new E2();
        double a = 8.5;
        double b = 11;
        // invoking perimeter method
        p.perimeter(a, b);
        //.invoking length method
        p.length(a, b);
    }
}