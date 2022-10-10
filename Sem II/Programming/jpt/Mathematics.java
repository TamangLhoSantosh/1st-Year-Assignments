public class Mathematics{
    String Op;
    int Op1, Op2;
    public Mathematics(){

    }
    public void setOp(String Op){
        this.Op = Op;
    }

    public void setOp1(int Op1){
        this.Op1 = Op1;
    }

    public void setOp2(int Op2){
        this.Op2 = Op2;
    }
    
    public it calculator() throws MyCustomException{
        switch (Op) {
            case "+":
                return Op1 + Op2;
            case "-":
                return Op1 -Op2;
            case "X":
                return Op1 * Op2;
            case "/":
                try {
                    return Op1 / Op2;
                } catch (ArthimeticException e) {
                    throw new MyCustomException();
                }
                return Op1 / Op1;
            default:
                return 0;
        }
    }
}