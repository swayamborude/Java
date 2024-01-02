package Java.Operators;

public class ternary {
    public static void main(String[] args) {
        
        //Example 1
        int n1 = 5;
        int n2 = 10;
        int n3 = (n1 > n2) ? n1 : n2;
        /* if Exp1(n1 > n2) is true so execute the Exp2(n1) and
        if Exp1 is false so execute the Exp3(n2) */
        System.out.println("1.Result is:- " + n3);

        //Example 2
        int a = 12;
        int b = 23;
        int c = (a < b) ? a : b;
        System.out.println("2.Result is:- " + c);


    }
}
