package QuickSortAlgorithm;

public class QuickSort {

    public static int partition(int arr[],int st, int end)
    {
        int index = st-1;
        int pivot = arr[end];
        for(int j=st;j<end;j++)
        {
            if(arr[j]<=pivot)
            {
                index++;
                int temp =arr[j];
                arr[j]=arr[index];
                arr[index] = temp;
            }
        }
        index++;
        int temp =arr[end];
        arr[end]=arr[index];
        arr[index] = temp;
        return index;
    }

    public static void quickSort(int arr[], int st, int end)
    {
        if(st<end)
        {
            int pivotIndex = partition(arr,st, end);
            quickSort(arr, st, pivotIndex-1);
            quickSort(arr, pivotIndex+1,end);
        }
    }
    public static void main(String[] args) {
        int[] arr={6,2,3,5,6,8,9};
        quickSort(arr,0, arr.length-1);
        for(int i : arr)
            System.out.println(i);
    }
}
