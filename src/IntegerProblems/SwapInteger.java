package IntegerProblems;

public class SwapInteger {
    public static void swapIntegerWithoutUsingThirdVariable(int a, int b)
    {
        //Using + operator
        a = a+b;
        b=a-b;
        a=a-b;

//        //Using * operator
//        a = a*b;
//        b = a/b;
//        a = a/b;

        //Using XOR ^

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a);
        System.out.println(b);

    }

    public static void swapWithUsingThirdVariable(int a , int b)
    {

    }
}
