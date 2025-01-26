package MainMethod;

public class MainMethodOverride {

    //JVM -- will search for exact Signature of the main method PSVM with String[] args paratmeter
    public static void main(String[] args) {
    System.out.println("main method 1");
    }

    public static void main(String args) {
        System.out.println("main method 2");

    }

    public static void main(int[] args) {
        System.out.println("main method 3");

    }

    public static void main(int args) {
        System.out.println("main method 4");

    }


}
