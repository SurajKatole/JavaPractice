package Patterns;

public class AdvanceJavaPatterns {
/*
    *   *
    ** **
    *****
    ** **
    *   *
*/
    public static void ButterflyPattern(int num)
    {
        for(int i=1;i<=num;i++)
        {
            int count =2*(num-i);
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=count;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=num;i>=1;i--)
        {
            int count =2*(num-i);
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=count;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


/*
         *****
        *****
       *****
      *****
    *****
*/
    public static void newPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

/*

          1
         2 2
        3 3 3
       4 4 4 4
      5 5 5 5 5

*/

      public static void numberPyramid(int num)
      {
          for(int i=1;i<=num;i++)
          {
              for(int j=num;j>i;j--)
              {
                  System.out.print(" ");
              }
              for(int j=1;j<=i;j++)
              {
                  System.out.print(i+" ");
              }
              System.out.println();
          }
      }

    public static void main(String[] args) {
//        ButterflyPattern(5);
//        newPattern(5);
        numberPyramid(5);
    }
}
