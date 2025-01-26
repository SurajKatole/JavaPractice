package ExceptionHandling;

public class FinallyBlock {

    //The main principle of finally block is that no matter what, the code in finally block is always executed

    public static void finallyWithTry()
    {
        //finally block can be used alone with try block
        try{
            System.out.println("try alone with finally");
        }
        finally {
            System.out.println("finally alone with try");
        }
    }
    public static void tryCatchFinally()
    {
        //finally can be used with try-catch both
        try{
            System.out.println("try alone with finally");
            throw new RuntimeException("Exception from try");
        }
        catch (Exception e)
        {
            System.out.println("catch block code");
            System.out.println("Exception : "+ e.getMessage());
        }
        finally {
            System.out.println("finally code execution");
        }
    }

    public static void exceptionInFinally()
    {
        try{
            throw new RuntimeException("Exception in try block");
        }
        //Catch doesn't catch the RuntimeException thrown by try block
        //Still the exception thrown by catch or try is suppressed
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
            throw new RuntimeException("Exception in catch block");
        }
        //The exception thrown by finally block takes precedence or overrides the exceptions in try or catch block
        //This is unhandled exception in finally block, it results in termination of program
        //In this case the exceptions from try and catch block are lost
        finally {
            throw new RuntimeException("Exception in finally");
        }
    }

    public static void tryCatchInsideFinally()
    {
        try{
            throw new RuntimeException("Exception in try block");
        }

        //Catch doesn't catch the RuntimeException thrown by try block
        //now the try block exception is thrown

//        catch (NumberFormatException e)

        //Here the exception from catch is thrown as try exception is handled
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            throw new RuntimeException("Exception in catch block");
        }
        //We can use try catch block inside the finally block for exception handling in critical scenarios
        finally {
            try {
                throw new RuntimeException("Exception in finally");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {

//        finallyWithTry();
//        tryCatchFinally();
        tryCatchInsideFinally();
//        exceptionInFinally();

    }
}
