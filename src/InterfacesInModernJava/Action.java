package InterfacesInModernJava;

import org.checkerframework.checker.units.qual.A;

public class Action implements ModernJavaInterfaces{

    @Override
    //public default void getInterfaceType() //-- Extension methods can only be used within an interface
                                             //Hence can't use default here
    public void getInterfaceType()
    {
        System.out.println("Action Type");
    }

    @Override
    public void mustImplement() {} // as its abstract method in Interface

    public void actionPersonal()
    {
        System.out.println("Action personal method");
    }

    public static void main(String[] args) {
        ModernJavaInterfaces m = new Action();
        m.getInterfaceName(); // calls the default method from Interface
        m.getInterfaceType(); // calls the method from Action
        m.mustImplement(); // calls the method from Action as its declared in interface

        ModernJavaInterfaces.getFileName(); // its static method hence needs to be called from class reference and not instance/object

        //m.actionPersonal(); //-- Cannot resolve method 'actionPersonal' in 'ModernJavaInterfaces'
                              // As the method is only declared in Action and Interface has no knowledge of it
                              //Hence can't be accessed through interface reference variable

        Action a = new Action();
        a.getInterfaceName(); // calls the default method from Interface
        a.getInterfaceType(); // calls the method from Action -- as object is of Action and priority is of Action methods
        a.actionPersonal(); // can access as reference variable is of type Action
    }
}
