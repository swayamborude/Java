package Java.Operators;

public class logical {
    public static void main(String[] args) {
        
        //1.Logical 'AND' Operator (&&)
        int x = 5;
        System.out.print("1.Result is:- ");
        System.out.println(x > 2 && x < 10); //(&&)

        //2.Logical 'OR' Operator (||)
        int y = 10;
        System.out.print("2.Result is:- ");
        System.out.println(y > 15 || y < 12); //(||)

        //3.Logical 'NOT' Operator (!)
        int a = 10;
        int b = 1;
        System.out.print("3.Result is:- ");
        System.out.println(!(a > b)); //(!)

    }
}
