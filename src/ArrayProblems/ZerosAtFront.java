package ArrayProblems;

public class ZerosAtFront {
    public static int[] putZerosAtStart(int[] arr)
    {
        int[] result = new int[arr.length];
        int index =0;
        for(int i : arr)
        {
            if(i==0)
            {
                result[index]=0;
                index++;
            }
        }
        for(int i : arr)
        {
            if(i!=0)
            {
                result[index]=i;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] res = putZerosAtStart(new int[] {4,5,6,-8,0,-6,7,-3,0,9,-5});
        String result ="{";
        for(int i: res)
        {
            result = result + i + ",";
        }
        System.out.println(result.substring(0,result.length()-1)+ "}");

    }
}
