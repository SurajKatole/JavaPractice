import java.util.*;

public class Main {

    public static void main(String[] args) {

        try{
            throw new RuntimeException("test");
        }
        finally
        {
            System.out.println("Printed");
        }
    }


}