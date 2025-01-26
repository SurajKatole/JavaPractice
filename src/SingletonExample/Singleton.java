package SingletonExample;

public class Singleton {
    //In OOP , Singleton class is a class that can only have one object (instance of the class) at a time.
    //How to design ?
    //1. Make the constructor of class as private
    //2. Write a static method that has return type of object of that Singleton Class (Lazy Initialization)

    public static Singleton singleton_instance = null;
    public String str;


    private Singleton()
    {
        str="Hey I am using Singleton class pattern";
    }

    public static Singleton getInstance()
    {
        if(singleton_instance==null)
        {
            singleton_instance=new Singleton();
        }
        return singleton_instance;
    }

    public static void main(String[] args)
    {

        Singleton x = getInstance();
        Singleton y = getInstance();
        Singleton z = getInstance();

        x.str= (x.str).toUpperCase();
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);

        z.str= (z.str).toLowerCase();

        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);
    }
}
