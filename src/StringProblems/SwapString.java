package StringProblems;

public class SwapString {
    public static void swapStringWithoutUsingThirdVariable(String s1, String s2)
    {
        System.out.println("Before Swapping...");
        System.out.println("S1 : "+s1);
        System.out.println("S2 : "+s2);

        //Concat Strings and assign to s1
        s1=s1+s2;

        //Substring
        s2=s1.substring(0,s1.length()-s2.length());

        //Substring
        s1=s1.substring(s2.length());

        System.out.println("After Swapping...");
        System.out.println("S1 : "+s1);
        System.out.println("S2 : "+s2);
    }
}
