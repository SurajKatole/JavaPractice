package InterviewProblems;

import javax.swing.plaf.IconUIResource;

public class PrintFirstDuplicateWord {

    //Hey java is java best language is java
    //java
    public static void printFirstDuplicateWord(String str)
    {
        String[]  strArr = str.split(" ");

        for(int i=0;i< strArr.length;i++)
        {
            int count =0;
            for(int j=i+1;j< strArr.length;j++)
            {
                if(strArr[i].equals(strArr[j]))
                {
                    count++;
                }
            }
            if(count>0) {
                System.out.println(strArr[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        printFirstDuplicateWord("Hey java is java best language is java");
    }
}
