package InterviewProblems;

import java.util.HashSet;
import java.util.Set;

public class SumOfUniqueElementsArray {

    public static int sumOfUnique(int[] arr)
    {
        Set<Integer> set = new HashSet<>();
        for(int i : arr)
        {
            set.add(i);
        }
        int result =0;
        for(int i:set)
        {
            result+=i;
        }
        return result;
    }

    public static void main(String[] args) {
        int res = sumOfUnique(new int[] {1,2,3,4,6,7,3,4});
        System.out.println(res);
    }
}
