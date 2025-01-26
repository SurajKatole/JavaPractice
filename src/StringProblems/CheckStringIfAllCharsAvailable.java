package StringProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckStringIfAllCharsAvailable {
    public static boolean checkIfAllCharsPresent(String s1, String s2)
    {
        List<Character> chList = new ArrayList<>();
        for(char c: s1.toCharArray())
        {
            chList.add(c);
        }
        for(int i=0;i<s2.length();i++)
        {
            if(!chList.remove((Character) s2.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfAllCharsPresentMap(String s1, String s2)
    {
        Map<Character,Integer> map1 = new HashMap<>();
        for(char c: s1.toCharArray())
        {
            if(map1.containsKey(c))
            {
                map1.put(c,map1.get(c)+1);
            }
            else {
                map1.put(c,1);
            }
        }
        Map<Character,Integer> map2 = new HashMap<>();
        for(char c: s2.toCharArray())
        {
            if(map2.containsKey(c))
            {
                map2.put(c,map2.get(c)+1);
            }
            else {
                map2.put(c,1);
            }
            if(!map1.containsKey(c))
            {
                return false;
            }
        }
        for(Map.Entry<Character, Integer> entry : map2.entrySet())
        {
            if(entry.getValue()!=map1.get(entry.getKey()))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkIfAllCharsPresent("surajkatole","raaj"));
        System.out.println(checkIfAllCharsPresent("surajkatole","raaaj"));
        System.out.println(checkIfAllCharsPresentMap("surajkatole","raaj"));
        System.out.println(checkIfAllCharsPresentMap("surajkatole","raaaj"));
    }
}
