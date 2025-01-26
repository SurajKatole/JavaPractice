package StringProblems;

public class CapitalizeString {
    public static String capitalize(String str)
    {   String newStr="";
        String[] strArr = str.split(" ");

        for(String s : strArr)
        {
            newStr+=s.substring(0,1).toUpperCase() + s.substring(1);

        }
        return newStr;

    }
    public static void main(String[] args) {
        System.out.println(capitalize("suraj prakash katole"));
    }
}
