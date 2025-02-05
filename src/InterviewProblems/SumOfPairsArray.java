package InterviewProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Find unique pairs of integers from array that result as zero and print them
//[1,0,-2,3,-1,2,-4,5,-8,-5]
public class SumOfPairsArray {

    public static void pairsUsingSet(int[] input)
    {
        List<Integer> list = Arrays.stream(input).boxed().toList();
        Set<Integer> set = new HashSet<>();

        for(int i : input)
        {
            if(!set.contains(i) && i!=0 && list.contains(-i))
            {
                set.add(i);
                set.add(-i);
                System.out.println("Pair having sum zero is : "+i +"," + -i);
            }
        }
    }

    public static void main(String[] args) {
        pairsUsingSet(new int[] {1,0,-2,3,-1,2,-4,5,-8,-5});
    }
}
