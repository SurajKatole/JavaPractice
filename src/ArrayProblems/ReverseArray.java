package ArrayProblems;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] arr)
    {
        int[] result = new int[arr.length];
        int index =0;
        for(int i= arr.length-1;i>=0;i--)
        {
            result[i]=arr[index];
            index++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] res = reverseArray(new int[] {6,2,5,4});
        System.out.println(Arrays.toString(res));
    }
}
