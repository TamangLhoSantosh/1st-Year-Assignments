//declaring class green bootle
public class GreenBottle{

        //declaring empty print
        public void empty(){
            System.out.println();
            System.out.println();
            System.out.println();
        }

        //decring print
        public void green(int i){
            System.out.println(i + " green bottle stands on the wall,");
        }

    //declaring loop method
    public void loop(){

        int i = 10;

        empty();

        //staring loop
        while(i >= 1){

            if (i != 1){
                green(i);
                green(i);
                System.out.println("And if 1 green bottle should accidently fall,");
                i = i - 1;
                System.out.println("There'll be " + i + " bottles standing on the wall.");
                empty();
            }
            
            else{
                green(i);
                green(i);
                System.out.println("And if 1 green bottle should accidently fall,");
                i = i - 1;
                System.out.println("There'll be no bottles standing on the wall.");
                empty();
            }
        }
    }

    //main method is declared
    public static void main(String[] args) {
        
        //new object is created
        GreenBottle gb = new GreenBottle();
        
        //invoking loop method
        gb.loop();
    }
}