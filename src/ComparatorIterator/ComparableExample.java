package ComparatorIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    //In order for Collections to be able to perform sort on any class objects
    //the class must implement compareTo method from Comparable Interface
    //The reason why all other collections are able to use sort without passing a comparator
    //is that they all implement this compareTo method from Comparable Interface
    public static class Student implements Comparable<Student>
    {
        int age;
        String name;

        public Student(int age, String name )
        {
            this.age = age;
            this.name= name;
        }

        @Override
        public String toString() {
            return age + ":" + name;
        }

        @Override
        public int compareTo(Student that) {
            if(this.age>that.age)
            {
                return 1;
            }
            return -1;
        }
    }


    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();
        list.add(new Student(31, "Suraj"));
        list.add(new Student(15, "Arti"));
        list.add(new Student(17, "Prakash"));
        list.add(new Student(21, "Tushar"));

        Collections.sort(list);

        System.out.println(list);

    }
}
