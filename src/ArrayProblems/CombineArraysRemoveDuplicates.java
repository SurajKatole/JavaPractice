package ArrayProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CombineArraysRemoveDuplicates {

    public static int[] mergeArraysWithNoDuplicates(int[] arr1, int[] arr2)
    {
        Set<Integer> set = new HashSet<>();
        for(int i : arr1)
        {
            set.add(i);
        }
        for(int i : arr2)
        {
            set.add(i);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for(int i : set)
        {
            result[index] = i;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = mergeArraysWithNoDuplicates(new int[] {1,2,3,3}, new int[] {1,2,3,4});
        System.out.println(Arrays.toString(result));
    }
}
