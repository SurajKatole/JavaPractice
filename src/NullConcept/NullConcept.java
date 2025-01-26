package NullConcept;

public class NullConcept {
    //null is case sensitive
    //null is a keyword

    static Object obj;
    static String str;
    static NullConcept nc;



    public static void main(String[] args) {

        //default reference value will be null
        System.out.println(obj);
        System.out.println(str);
        System.out.println(nc);

        Integer i = null;
//        int j = i; // not allowed as Integer is class and int is data type
//        System.out.println(j);


        Integer a = null;
        Integer b = 10;

        System.out.println(b instanceof Integer);
        System.out.println(a instanceof Integer); // false as its pointing null, reference will be applied only when value is assigned

        NullConcept obj = null;
//        obj.send(); // NullPointerException
        obj.sum(); // -- static methods can be accessed by null references
                    // static methods are saved into common memory and do not have any memory allocation inside the object


        //null can be compared to null
        System.out.println(null==null);
        System.out.println(null!=null);

        //null can be assigned to any wrapper class
        String str = null;
        Integer j = null;
        Double d = null;

        //null can be casted into String
        String nString = (String) null;
        System.out.println(nString);
        System.out.println(nString + "Suraj");// it can be appended
//        System.out.println(nString.length());// NullPointerException -- no action/operation/manipulation can be performed
//        System.out.println(nString.charAt(0));// NullPointerException -- no action/operation/manipulation can be performed

    }

    public static void sum()
    {
        System.out.println("sum...");
    }

    public  void send()
    {
        System.out.println("send...");
    }

}
