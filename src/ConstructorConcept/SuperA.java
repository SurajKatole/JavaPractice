package ConstructorConcept;

public class SuperA {
    public SuperA(){
        System.out.println("Parent class Constructor");
    }

    public SuperA(int i)
    {
        System.out.println("Parent Class Constructor with value of i is :"+i);
    }

    public SuperA(int i, int j)
    {
        System.out.println("Parent Class Constructor with value of i is :"+i);
        System.out.println("Parent Class Constructor with value of j is :"+j);
    }
}
