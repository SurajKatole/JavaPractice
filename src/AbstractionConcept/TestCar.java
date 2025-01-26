package AbstractionConcept;

public class TestCar {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.start();
        b.stop();
        b.refuel();
        b.theftSafety();


    //Dynamic Polymorphism or Top Casting
        Car car = new BMW(); //BMW object saved into Car reference variable
        car.refuel();
        car.start();
        car.stop();
        System.out.println(car.wheels);
      //car.theftSafety() // not allowed as the Car Interface does not have this method
    }
}
