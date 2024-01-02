package Java.Operators;

public class unary {

    public static void main(String[] args) {
        
        //1.Unary Minus(-)
        int n1 = 20;
        n1 = -n1;
        System.out.println("1.Result:- " + n1);

        //2.NOT Operand(!)
        boolean a = true;
        System.out.println("2.Result:- " + a);
        System.out.println("3.Result:- " + !a); // (!)

        //3.Increment(++)
        int q = 32;
        q++; // (++)
        System.out.println("4.Result:- " + q);

        //4.Decrement(--)
        int w = 100;
        w--; //(--)
        System.out.println("Result:- " + w);
        
    }
    
}
