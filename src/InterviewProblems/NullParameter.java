package InterviewProblems;

public class NullParameter {
    public static void test(Object o)
    {
        System.out.println("Object argument");
    }
    public static void test(String s)
    {
        System.out.println("String argument");
    }
//    public static void test(StringBuffer s)
//    {
//        System.out.println("String argument");
//    }

    public static void main(String[] args) {
        test(null); // cant use string and stringbuffer
    }
}
