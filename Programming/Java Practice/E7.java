//class is declared as E7
class E7{

    //costOfCar method is declared
    public void costOfCar(){
  
        //declaring variable
        int cost = 2849000;
        int milePerYear = 15000;
        double petrolPrice = 677.588;
        int efficiency = 40;
        int time = 5;
        int estimatedValue = 1100000 ;
  
        //mathematical calculation
        double petrol = (milePerYear * time * petrolPrice *efficiency) / 100;
        double b = cost + petrol ;
  
        //ptinting obtained result
        System.out.println("The cost of car ownimg a car for 5 years is Rs." + b);
        System.out.println("The cost of a car after 5 years is Rs." + estimatedValue);
    }
    
    //declaring main method
    public static void main(String[] args) {
  
        //creating new object and initializing the object
        E7 e = new E7();
  
        //invoking costofCar method
        e.costOfCar();
    }
}