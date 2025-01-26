package ExceptionHandling;

public class TryCatch {
    int a=10;
    public static void main(String[] args) {
        //uncaught exception
//    int i = 9/0; //Arithmetic exception -- / by zero

        //caught exception
//        Thread.sleep(2000);

//        TryCatch obj = null;
//        TryCatch obj = new TryCatch();

//        TryCatch obj = new TryCatch();
//        System.out.println(obj.a);
//        obj=null;
//        System.out.println(obj.a); //NullPointerException

        //1.try-catch block
        try{
            int i = 9/0;
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace(); // will print where the exception occured but will not terminate execution
            System.out.println(e.getMessage()); // will print the message of exception -- / by zero
        }
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");

        try{
            int i = 9/0;
        }
        catch (Throwable e) //Super class of all errors and Exceptions in JAVA
        {
            e.printStackTrace(); // will print where the exception occured but will not terminate execution
            System.out.println(e.getMessage()); // will print the message of exception -- / by zero
        }
    }

}
