package StaticOverloadOverride;

public class TestSportsCar
{
    public static void main(String[] args) {
        Audi a = new Audi();
        a.start();
        a.stop(); // Static member 'StaticOverloadOverride.Audi.stop()' accessed via instance reference
    }
}
