package Patterns;

public class JavaPatterns {

/*  *****
    *****
    *****
    *****
    *****   */

    public static void nxnMatrix(int num)
    {
        for(int i =1; i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*  *****
        *   *
        *   *
        *   *
        *****   */
    public static void rectStarPattern(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                if(i==1 ||i==num || j==1 ||j==num)
                {System.out.print("*");}
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }


/*      *
        **
        ***
        ****    */

    public static void RightAngledTriangle(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j =0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

/*      *****
        ****
        ***
        **
        *       */

    public static void InvertedRightAngledTriangle(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=num;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*         *
              **
             ***
            ****
           *****   */
    public static void MirroredRightAngledTriangle(int num)
    { int count =num;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                if(j>=count)
                {System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            count=count-1;
            System.out.println();
        }
    }

/*    1
      2 3
      4 5 6
      7 8 9 10
      11 12 13 14 15 */

    public static void IncrementalRightAngledTriangleOfDigits(int num)
    {
        int count = 1;
        for(int i=1;i<=num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

/*
    1
    01
    101
    0101
    10101
*/

    public static void zeroOneRightTriangle(int num)
    {

        for(int i =1; i<=num;i++)
        {
            for(int j=0;j<i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1);
                }
                else
                {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
//        nxnMatrix(5);
//        rectStarPattern(5);
//        RightAngledTriangle(5);
//        InvertedRightAngledTriangle(5);
//        MirroredRightAngledTriangle(5);
//        IncrementalRightAngledTriangleOfDigits(5);
        zeroOneRightTriangle(5);
    }
}
