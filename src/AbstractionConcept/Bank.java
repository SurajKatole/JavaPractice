package AbstractionConcept;

public abstract class Bank {

    //can have static , final and non static variable declarations
    int amt =100;
    final int rate = 10;
    static int loanRate=10;


    //Abstact class can have abstract as well as non abstract methods
    //hiding implemetation logic -- Abstraction
    //Supports partial abstraction
    //Cant create object of abstract class
    public abstract void loan();
    public void credit()
    {
       System.out.println("Credit");
    }
    public void debit()
    {
       System.out.println("Debit");
    }
//    public abstract static void insurance() ;//-- Illegal combination of modifiers: 'abstract' and 'static'
   public static void insurance() //Can have static methods
    {
       System.out.println("Debit");
    }

}
