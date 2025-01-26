package InterviewProblems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInString {
    //Hey java is java best language is java
    //java : 3
    //is : 2

    public static void findDuplicateWords(String str)
    {
        String[] splitStr = str.split(" ");
        Map<String, Integer> strMap = new HashMap<String, Integer>();



        for(String s : splitStr)
        {
//            strMap.put(s,strMap.getOrDefault(s,0)+1);
            if(strMap.containsKey(s.toLowerCase()))
            {
                strMap.put(s.toLowerCase(),strMap.get(s)+1);
            }
            else
            {
                strMap.put(s.toLowerCase(),1);
            }
        }

        System.out.println(strMap);

        for(Map.Entry<String, Integer> entry : strMap.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {

        findDuplicateWords("Hey java is java best language is java");
    }
}
