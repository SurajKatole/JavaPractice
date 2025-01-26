package AbstractionConcept;

public interface Car {

    //final and static variables
    int wheels=4;


    //Always define abstract methods
    //public by default
    //no method body
    //no method declaration
    //we achieve 100% abstraction
    //Cant create object of Interface
    //No need to write abstract keyword
    //No need to write public keyword

    void start();
    void stop();


    //    private void refuel(); // -- Private methods in interfaces should have a body
    public void refuel();
}
