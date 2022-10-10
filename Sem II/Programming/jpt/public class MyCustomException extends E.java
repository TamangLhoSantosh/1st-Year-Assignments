public class MyCustomException extends Exception{
    public MyCustomException(){
        super("You must have divided by zero");
    }
}