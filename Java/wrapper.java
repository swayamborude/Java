package Java;

public class wrapper {
    public static void main(String[] args) {
        
        //1.Autoboxing
        int a = 20;
        Integer i = a;  // Autoboxing
        System.out.println("1.Result is:- " + i);
        /*
          the automatic conversion of primitive types
          to the object of their corresponding wrapper
          classes.
        */
        
        //2.Unboxing
        int num = i.intValue(); // Unboxing
        System.out.println("2.Result is:- " + num);
        /*
          Automatically converting an object of a 
          wrapper class to its corresponsing primitive
          type 
        */
    }  
}
