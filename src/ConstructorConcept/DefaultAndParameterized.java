package ConstructorConcept;

public class DefaultAndParameterized {

    //Constructor is first thing that is called when you create an object of a class
    //Constructor cannot return any value -- so no return type
    //Constructor name should be same as class name
    //Constructor is not a function
    //Constructor cannot be static

    public DefaultAndParameterized(){
        System.out.println("Default Constructor");
    }

    //Constructor overloading -- Constructors can be overloaded
    public DefaultAndParameterized(int i)
    {
        System.out.println("Single parameter constructor");
        System.out.println("value of i"+i);
    }

    public DefaultAndParameterized(int i, int j)
    {
        System.out.println("Double parameter constructor");
        System.out.println("value of i : "+i);
        System.out.println("value of j : "+j);
    }

    public static void main(String[] args) {

        DefaultAndParameterized superAndThis = new DefaultAndParameterized(); // Default Constructor
        DefaultAndParameterized superAndThis1 = new DefaultAndParameterized(10); // Single parameter Constructor
        DefaultAndParameterized superAndThis2 = new DefaultAndParameterized(10,20); // Double parameter Constructor

    }
}
