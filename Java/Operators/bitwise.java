package Java.Operators;

public class bitwise {
    public static void main(String[] args) {
        
        //1.AND (&)
        int a = 1;
        int b = 5;
        System.out.print("1.Result is:- ");
        System.out.println(a & b); //(&)
        /*
         If both bits are 1, it gives 1,
         else it shows 0. 
        */

        //2.OR (|)
        int x = 2;
        int y = 4;
        System.out.print("2.Result is:- ");
        System.out.println(x | y);
        /*
         If either bits are 1, it gives 1,
         else it shows 0.
        */

        //3.XOR (^)
        int m = 3;
        int n = 6;
        System.out.print("3.Result is:- ");
        System.out.println(m ^ n);
        /*
         If corresponding bits are different, it gives 1,
         else it shows 0.
         */

        //4.Complement (~)
        int f = 7;
        System.out.print("4.Result is:- ");
        System.out.println(~f);
        /*
         Take f binary number,
         and these binary number convert 1 to 0 and 0 to 1.
         (Use of Complement is Convert into Positive to Negative
         and Negative to Positive)
         */
    }
}
