package InterviewProblems;

import java.util.HashMap;
import java.util.Map;

public class GroupByStringLength {
    public static void groupByStringLength(String str)
    {
        String[] strArr = str.split(" ");
        Map<Integer, String> map = new HashMap<>();
        for(String s: strArr)
        {
            if(!map.containsKey(s.length()))
            {
                map.put(s.length(), s);
            }
            else
            {
                map.put(s.length(), map.get(s.length())+", " + s);
            }
        }
        for(int i : map.keySet())
        {
            System.out.println(i+"--> "+ map.get(i));
        }

    }

    public static void main(String[] args) {

        groupByStringLength("hello java is the best programming language");
        //output should be in format of :
        /*
        2--> is
        3--> the
        4--> java, best
        5--> hello
        7--> language
        11--> programming
        */

    }
}
