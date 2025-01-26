package ExceptionHandling;

public class ThrowsKeyword {
    //Here JVM will accept this exception and will provide exception hierarchy
    public static void main(String[] args) throws ArithmeticException {
        ThrowsKeyword obj = new ThrowsKeyword();
        obj.sum2();
        System.out.println("XYZ"); // will be executed as exception is catched/handled
        obj.sum(); // throws exception to main
        System.out.println("ABC"); // will not be executed as program will terminate
    }
    public void sum() throws ArithmeticException
    {
        div(); // throws exception to sum
    }
    public void sum2()
    {
        try {
            div(); // throws exception to sum
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
    }
    public  void  div() throws ArithmeticException
    {
        int i=9/0; // exception
    }
}
