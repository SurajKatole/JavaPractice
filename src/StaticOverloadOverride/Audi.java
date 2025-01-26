package StaticOverloadOverride;

public class Audi extends SportsCar{
    @Override
    public void start()
    {
        System.out.println("--Audi start---");
    }
    //public void stop(){} //Instance method 'stop()' in 'StaticOverloadOverride.Audi' cannot override static method 'stop()' in 'StaticOverloadOverride.SportsCar'
    //@Override  //--- Static methods cannot be annotated with @Override
    public static void stop(){
        System.out.println("--Audi stop--");
    }


}
