package Streams;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamConcept {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9,10).filter(e -> (e%2==0)).forEach(e -> System.out.println(e));

        Stream.of("hello", "java").map(e -> e+" world").forEach(System.out::println);

        //Optional:
        String s[]= new String[5];
//        System.out.println(s[2].length()); //  NullPointerException
        Optional<String> isNull = Optional.ofNullable(s[2]);

        if(isNull.isPresent())
        { }
        else {
            System.out.println("value is not available");
        }
    }
}
