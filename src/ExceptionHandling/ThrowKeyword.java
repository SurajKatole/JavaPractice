package ExceptionHandling;

public class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("ABC");
        try {
            throw new Exception("Suraj Exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        throw new Exception("Suraj Exception"); // will terminate program and below code will be unreachable
                                                  //Also the main method needs to Throw this exception with Throws keyword

        String ExecutionFlag="N";

        if(ExecutionFlag.equals("N"))
        {
            try
            {
                throw new Exception("Execution Flag is N");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        System.out.println("XYZ");
    }

}
