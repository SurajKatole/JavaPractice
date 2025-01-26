package InterviewProblems;

public class CompareIntegers {
    public static void main(String[] args) {

        //range for Integer caching is -128 to 127
        Integer i1 = 100;
        Integer i2 = 100;
        Integer j1 = 128;
        Integer j2 = 128;
        Integer k1 = -129;
        Integer k2 = -129;
        int a;


        System.out.println(i1==i2);
        System.out.println(j1==j2);
        System.out.println(k1==k2);
    }
}
