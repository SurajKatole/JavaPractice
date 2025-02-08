package StringProblems;

public class StringReverse {

    public static String reverseUsingForLoop(String s)
    {
        String reverse ="";
        for(int i=s.length()-1; i>=0;i--)
        {
            reverse=reverse + s.charAt(i);
        }
        return reverse;
    }

    public static String reverseUsingStringBuffer(String s)
    {
       StringBuffer sf = new StringBuffer(s);

       return sf.reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = reverseUsingStringBuffer("Suraj Katole");
        System.out.println(str1);
        String str2 = reverseUsingForLoop("Suraj Katole");
        System.out.println(str2);
    }
}
