package StaticOverloadOverride;

public class SportsCar {
    public void start()
    {
        System.out.println("--Start--");
    }

    //Method Hiding -- Declaring it static in parent or super class
    public static void stop()
    {
        System.out.println("--Stop--");
    }
    public void refuel()
    {
        System.out.println("--Refuel--");
    }
}
