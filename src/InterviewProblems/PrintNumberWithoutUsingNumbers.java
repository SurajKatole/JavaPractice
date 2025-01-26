package InterviewProblems;

public class PrintNumberWithoutUsingNumbers {

    public static void printNumbers()
    {
        int one = 'A'/'A';
        String s ="..........";

        for(int i=one;i<=(s.length()*s.length());i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        printNumbers();
    }
}
