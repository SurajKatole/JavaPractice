package InterviewProblems;

public class PalindromeNumber {

    public static  void isPalidrome(int num)
    {
        int r=0;
        int sum=0;
        int t=num;

        while(num>0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(sum==t)
        {
            System.out.println("Is Palindrome");
        }
        else {
            System.out.println("Is Not Palindrome");
        }
    }

    public static void main(String[] args) {
        isPalidrome(101);
    }
}
