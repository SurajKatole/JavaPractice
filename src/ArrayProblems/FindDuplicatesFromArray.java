package ArrayProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesFromArray {
    public static void findDupliacatesUsingForLoop(String[] strArray)
    {
        for(int i=0;i<strArray.length;i++)
        {
            for(int j=i+1;j<strArray.length;j++)
            {
                if(strArray[i]==strArray[j])
                {
                    System.out.println("Duplicate element is :" + strArray[i]);
                }
            }
        }
    }

    public static void findDuplicatesUsingHashSet(String[] strArray)
    {
        Set<String> setOfStrings = new HashSet<String>();
        for(String str : strArray)
        {
            if(!setOfStrings.add(str))
            {
                System.out.println("Duplicate element is : "+str);
            }
        }
    }

    public static void findDuplicatesUsingHashMap(String[] strArray)
    {
        Map<String, Integer> stringIntegerMap = new HashMap<String, Integer>();
        for(String str: strArray)
        {
            if(stringIntegerMap.containsKey(str))
            {
                stringIntegerMap.put(str, stringIntegerMap.get(str)+1);
            }
            else{
                stringIntegerMap.put(str,1);
            }
        }

        for(Map.Entry<String,Integer> entry : stringIntegerMap.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println("Duplicate element is : " + entry.getKey());
            }
        }
    }
}
