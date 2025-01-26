package ConstructorConcept;

public class ConstructorWithThisKeyword {

    //class variables
    String name;
    int age;
    int dontWantToUseThisKeyword;

    public ConstructorWithThisKeyword(String name, int age)
    {
        //this keyword is used when local and class variables have same name -- to avoid confusion

        //this.globalVariable = localVariable
        this.name=name;
        this.age=age;

        //to avoid using this you can name the class variables different than the local variable in constructor
        dontWantToUseThisKeyword=age;



        System.out.println(name);
        System.out.println(age);

    }
    public static void main(String[] args) {

        ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 27);
    }
}
