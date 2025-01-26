package InterviewProblems;

public class FactorialNumber {
    //fact of 3 = 3*2*1 = 6
    //fact of 5 = 5*4*3*2*1 = 120
    //fact of 0 = 1

    //1. without recursive function
    public static int factorial(int num)
    {
        int fact=1;
        for(int i =1;i<=num;i++)
        {
            fact = fact *i;
        }
        return fact;
    }

    //2. with recursive function : a function that calls itself
    public static int recursiveFact(int num)
    {
        if(num==0)
            return 1;
        else
            return (num * recursiveFact(num-1));
    }
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorial(1));
        System.out.println(factorial(0));
        System.out.println(recursiveFact(10));
        System.out.println(recursiveFact(1));
        System.out.println(recursiveFact(0));
    }
}
