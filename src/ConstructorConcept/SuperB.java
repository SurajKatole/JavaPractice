package ConstructorConcept;

//Super is used in child class constructor
public class SuperB extends SuperA{
    String name = "My name is SuperB";
    public SuperB(){

        System.out.println("Child class Constructor");
    }

    public SuperB(int i)
    {
        //Super keyword should be the first statement in any constructor
//        System.out.println("Child class Constructor with value i is : "+i); //Gives error as -- Call to 'super()' must be first statement in constructor body
        super(i); //Calling parent class constructor
        System.out.println("Child class Constructor with value i is : "+i);
    }

    public static void main(String[] args) {
        SuperB obj = new SuperB();  //this will call parent class constructor first and then call child class constructor
        SuperB obj1 = new SuperB(10);

    }
    public void printHello()
    {
        System.out.println("Hello from Child - SuperB");
    }
}
