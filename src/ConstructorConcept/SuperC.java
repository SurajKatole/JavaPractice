package ConstructorConcept;

public class SuperC extends SuperB{

    String name = "My name is SuperC";
    public SuperC()
    {
//        super(10,20);     // this will give error as super only refers to immediate parent,
                            //and SuperB doesn't have double parameter constructor
        System.out.println("GrandChild Class Constructor");
    }
    public static void main(String[] args) {
        SuperC superC = new SuperC();
        superC.display();
        //String parentName = super.name; // -- ConstructorConcept.SuperC.super' cannot be referenced from a static context
                                          // -- super can't be used in static context as super relies on an object instance
    }

    public void display()
    {
        super.printHello(); // Can Access Parent Methods
        System.out.println(name);
        System.out.println(super.name);// Can Access Parent Fields
    }
}
