class E2{
    public void perimeter(double a, double b){
        double pm = 2 * (a + b);
        System.out.println("The perimeter is " + pm);
    }
    public void length(double a, double b){
        if (a > b)
        System.out.println("The length is " + a);
        else
        System.out.println("The length is " + b);
    }
    public static void main(String[] args) {
        double a = 8.5;
        double b = 11;
        E2 p = new E2();
        p.perimeter(a, b);
        p.length(a, b);
    }
}