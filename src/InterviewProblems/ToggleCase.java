package InterviewProblems;

import java.util.Arrays;

public class ToggleCase {

    public static String toggleStringCaseChArr(String str)
    {
        char[] chArr = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(chArr[i]))
            {
                chArr[i]=Character.toUpperCase(chArr[i]);
            }
            else if(Character.isUpperCase(chArr[i]))
            {
                chArr[i]=Character.toLowerCase(chArr[i]);
            }
        }
        str="";
        for(char c : chArr)
        {
            str=str+c;
        }
        return str;
    }


    public static String toggleUsingString(String str)
    {
        String result="";
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                result=result+Character.toUpperCase(str.charAt(i));
            }
            else if(Character.isUpperCase(str.charAt(i)))
            {
                result=result+Character.toLowerCase(str.charAt(i));
            }
            else
            {
                result=result+str.charAt(i);
            }
        }
        return result;
    }

    public static String toggleUsingStringBuilder(String str)
    {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                result=result.append(Character.toUpperCase(str.charAt(i)));
            }
            else if(Character.isUpperCase(str.charAt(i)))
            {
                result=result.append(Character.toLowerCase(str.charAt(i)));
            }
            else
            {
                result=result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toggleStringCaseChArr("sUrAj"));
        System.out.println(toggleUsingString("sUrAj"));
        System.out.println(toggleUsingStringBuilder("sUrAj"));
    }
}
