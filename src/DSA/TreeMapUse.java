package DSA;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapUse {
    public static void main(String[] args) {

        //TreeMap is similar to HashMap
        //It is sorted by-default
        //The keys are sorted in ascending order
        //It has same functions and methods like HashMap

        Map<Integer, Integer> map = new TreeMap<>();
        int[] ints = {1,3,4,5,2,3,1,4,7,8};

        for(int i : ints)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        //All the keys are sorted in ascending order
        System.out.println(map.keySet());

        System.out.println("Initial : "+ map);

        map.put(10,2);
        map.put(0,2);

        System.out.println("After put : "+map);

        map.remove(4);

        System.out.println("After remove : "+map);

        System.out.println(map.containsKey(4)); // returns boolean
        System.out.println(map.containsValue(2)); // returns boolean

        //This function can be used to perform functions on all elements in map
        map.forEach((key,value) -> {System.out.println(key+":"+value);});

        int total = 0;
        //Use Entry to get key value pairs
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
           total+=entry.getValue();
        }
        System.out.println("total :" +total);




    }
}
