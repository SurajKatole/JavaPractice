package InterviewProblems;

public class PrimeNumber {

    //2 is lowest prime number
    public static boolean isPrimeNumber(int num)
    {
        //edge or corner case
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public void getPrimeNumbers(int num)
    {
        for(int i=2;i<=num;i++)
        {
            if(isPrimeNumber(i))
            {
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args) {


    }
}
