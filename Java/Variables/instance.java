package Java.Variables;

public class instance {

    int a = 18; //Instance Variable
    
    public static void main(String[] args) {

        instance obj = new instance();
        System.out.println(obj.a);

        /*
         instance variable which is declared inside
         the class but outside of all the methods
         */

    }   
}