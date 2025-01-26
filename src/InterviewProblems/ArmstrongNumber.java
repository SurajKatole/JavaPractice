package InterviewProblems;

public class ArmstrongNumber {
    //Sum of cube of all numbers is equal to the number
    //153 -- 1*1*1 + 5*5*5 + 3*3*3 = 153
    //407 -- 4*4*4 + 0*0*0 + 7*7*7 = 407

    public void isArmstrongNumber(int num)
    {
        int cube=0;
        int r=0;
        int t=num;

        while(num>0)
        {
            r=num%10;
            num =num/10;
            cube = cube + (r*r*r);
        }
        if(t==cube)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not Armstrong number");
        }
    }
    public static void main(String[] args) {

    }

}
