package DSA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDSA {

    //HashMap stores values in key value pairs
    //HashMap is unordered
    //HashMap in unindexed
    //Values of HashMap can be accessed through unique keys
    //HashMap is mutable
    //Each pair of key value is called entry in HashMap
    //Entry is also a data type or object in Map Interface


    public static void declaration()
    {
        Map<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
    }

    public static void putAndIterateMethods()
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Suraj");
        System.out.println(map); // returns {1=Suraj}
        //All keys in map are unique
        //If you put another value for same key, the existing value is updated with the new value
        map.put(2,"Tushar");
        map.put(3,"Arti");
        map.put(4,"Prakash");



        //To iterate over a HashMap values
        //1. Use for each loop
        for(int i : map.keySet())
        {
            System.out.println(map.get(i));
        }

        //To iterate over key and values both as entrySet
        for(Map.Entry<Integer, String> entry: map.entrySet())
        {
            System.out.println(entry); // returns values as 1=Suraj
        }

        //2. using iterator
        //HashMap doesn't provide iterator on itself but Iterator can be used on keySet or entrySet

        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        Iterator<Integer> keyIterator = map.keySet().iterator();

        while (keyIterator.hasNext())
        {
            System.out.println(map.get(keyIterator.next()));
        }

    }

    public static void getAnArrayElementFrequency(int[] arr)
    {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> newMap = new HashMap<>();
        for(int i : arr)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }

        //The method getOrDefault returns the value from HashMap if present or return default value
        for(int i : arr)
        {
            newMap.put(i,newMap.getOrDefault(i,0)+1);
        }

        System.out.println(map);
        System.out.println(newMap);
    }

    public static void main(String[] args) {
//        putAndIterateMethods();
        getAnArrayElementFrequency(new int[]{1, 2, 3, 4, 5, 1, 2, 3});

    }
}
