// Declaring class as E1
class E1{

    // declaring constant incetomili with value
    public static final double INCHETOMILI = 25.4;

    //decalring conversion method
    public void conversion(double a, int b){

        //mathematical calculation
        double c = a * INCHETOMILI;
        double d = b * INCHETOMILI;
        System.out.println("The inches " + a + " * " + b + " in milimeters is " + c + " * " + d);
    }


    // declaring main method
    public static void main(String[] args) {
        double a = 8.5;
        int b = 11;

        // initializing object
        E1 e = new E1();
        
        //invoking conversion method
        e.conversion(a, b);
    }
}
