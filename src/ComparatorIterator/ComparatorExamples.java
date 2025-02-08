package ComparatorIterator;

import java.util.*;

public class ComparatorExamples {

    //Comparator in java is an interface
    //in order to use methods from an interface we either implement it in a class
    //or we can use and anonymous class

        static Comparator<Integer> comp = new Comparator<Integer>() {

        //compare in only one method declared in Comparator Interface
        //hence it needs to be implemented
        //By using this we can implement out own logic for comparing the objects
        //This method can be passed to various function of Collections class to achieve custom results

        @Override
        public int compare(Integer o1, Integer o2) {
            //Have created implementation to compare last digits of numbers
            if(o1%10 >o2%10)
            {
                return 1;
            }
            return -1;
        }
    };

        //Creating comparator for string based on its length
    static Comparator<String> strComp = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            if(o1.length()>o2.length())
                return 1;
            return -1;
        }
    }   ;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,11,22,78,90,14);

        Collections.sort(list, comp);

        System.out.println(list);

        List<String> strList = new ArrayList<>();
        Collections.addAll(strList,"Suraj", "o","ab", "largestr");

        Collections.sort(strList, strComp);

        System.out.println(strList);

    }
}
