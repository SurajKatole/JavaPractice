package InterviewProblems;

public class PrintWithoutSemicolon {
    public static void main(String[] args) {
        //1.
        if(System.out.printf("Hello World" + "\n")==null)
        {}

        //2.
        if(System.out.append("Hello World" + "\n")==null)
        {}

        if(System.out.append("Hello World").equals(null))
        {}
    }
}
