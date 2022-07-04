class E7{
    public void costOfCar(){
        int cost = 2849000;
        int milePerYear = 15000;
        double petrolPrice = 677.588;
        int efficiency = 40;
        int time = 5;
        int estimatedValue = 1100000 ;
        double petrol = (milePerYear * time * petrolPrice *efficiency) / 100;
        double b = cost + petrol ;
        System.out.println("The cost of car ownimg a car for 5 years is Rs." + b);
        System.out.println("The cost of a car after 5 years is Rs." + estimatedValue);
    }
    public static void main(String[] args) {
        E7 e = new E7();
        e.costOfCar();
    }
}