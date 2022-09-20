//E12 is declared as class
class E12{
    
    //loop method is declared
    public void loop(){
        String a = "+--+--+--+";
        String b = "|  |  |  |";
        int c = 1;

        //loop is declared
        while(c < 4){
            System.out.println(a);
            System.out.println(b);
            c++;
        }
        System.out.println(a);
    }

    //declaring mainn method
    public static void main(String[] args) {
   
        //creating new object and initializing the object
        E12 e = new E12();
   
        //invoking loop method
        e.loop();
    }
}