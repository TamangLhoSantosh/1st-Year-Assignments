class E1{
    public static final double INCHETOMILI = 25.4;
    public void conversion(double a, int b){
        double c = a * INCHETOMILI;
        double d = b * INCHETOMILI;
        System.out.println("The inches " + a + " * " + b + " in milimeters is " + c + " * " + d);
    }
    public static void main(String[] args) {
        double a = 8.5;
        int b = 11;
        E1 e = new E1();
        e.conversion(a, b);
    }
}
