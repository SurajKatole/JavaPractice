package ArrayProblems;

public class MaxSumSubArray {
    //[1,2,3,4,5] -- array
    //all possible subarrays are: (n*(n+1))/2
    //1, 12, 123, 1234, 12345
    //2,23,234,2345
    //3,34,345
    //4,45
    //5

    public static int getMaxSumOfSubArray(int[] num)
    {
        int maxSum=num[0];
        for(int i=0;i<num.length;i++)
        {
            for(int j=i;j<num.length;j++)
            {
                int subArraySum = 0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(num[k]);
                    subArraySum=subArraySum+num[k];
                }
                maxSum = Math.max(maxSum,subArraySum);
                System.out.print(" ");
            }
            System.out.println();
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int max = getMaxSumOfSubArray(new int[] {1,2,3,4,5});
        System.out.println("Max sum of SubArray is: "+max);
        int max1 = getMaxSumOfSubArray(new int[] {-1,-2,-3,4,5});
        System.out.println("Max sum of SubArray is: "+max1);
    }
}
