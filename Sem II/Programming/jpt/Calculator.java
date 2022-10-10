public class Calculator{
    public static void main(String[] args) {
        Mathematics m;
        try {
            m.setOp("/");
            m.setOp1(5);
            m.setOp2(0);
        } catch (MyCustomException e) {
            system.out.println("Custom Exception" + e.getMessage());
        }
        catch(ArithmeticException e){
            system.out.println("you must have divided by 0");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        m.setOp("x");
        m.setOp1(5);
        m.setOp2(5);

        try {
            System.out.println(m.Mathematics());
        } catch (Exception e) {
        }
    }
}