package InterfacesInModernJava;

public interface ModernJavaInterfaces {

    //String name1; // --Variable 'name1' might not have been initialized
                    // Must be initialized as they are static and final by default
    String name = "Suraj";

    //Interfaces can have default methods with implementation written inside the interface
    //The implementing classes do not necessarily have to implement the default methods
    //The implementing classes can reuse this implementation by calling this method
    //However they can also override this method and define their own implementation
    public default void getInterfaceName()
    {
        System.out.println("ModernJavaInterfaces Name");
    }


    //Interfaces can have static methods with implementation written inside the interface
    //The implementing classes do not necessarily have to implement the default methods
    public static void getFileName()
    {
        System.out.println("ModernJavaInterfaces FileName");
    }

    public default void getInterfaceType()
    {
        System.out.println("ModernJavaInterfaces Type");
    }

    public void mustImplement(); //Other than default and static all other method declarations are public and abstract
}
