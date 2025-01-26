package AbstractionConcept;

import org.checkerframework.checker.units.qual.A;

//Here the class is not abstract hence the methods from the Interface Car has to be implemented
public class AbstractCarChild extends AbstractCar{
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void refuel() {

    }

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
    }
}
