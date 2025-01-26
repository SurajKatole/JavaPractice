package AbstractionConcept;

import org.checkerframework.checker.units.qual.C;

//As this class is abstract, the methods from Interface need not be implemented and can remain unimplemented
public abstract class AbstractCar implements Car {

    @Override
    public void start()
    {
        System.out.println("Start from AbstractCar");
    }

//    public void stop(); //In order to not implement this method, you have to declare it abstract
    public abstract void stop();

    public static void main(String[] args) {
        //Here you have to implement all the unimplemented methods from Car Interface in order to create a new object of Abstract Class
        //You cannot create an object of Abstract Class without implementing the unimplemented methods
        AbstractCar abs = new AbstractCar() {
            @Override
            public void stop() {

            }

            @Override
            public void refuel() {

            }
        };

        //Here you have to implement all the unimplemented methods from Car Interface in order to create a new object of Abstract Class
        //You cannot create an object of Abstract Class without implementing the unimplemented methods
        Car car = new Car() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }

            @Override
            public void refuel() {

            }
        };
    }
}
