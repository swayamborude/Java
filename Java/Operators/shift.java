package Java.Operators;

public class shift {
    public static void main(String[] args) {
        
        //1.Left Shift Operator (<<)
        int a = 5;
        int b = 0b101;
        System.out.print("1.Result is:- ");
        System.out.println(a << 1); // (<<)
        System.out.print("1.Result is:- ");
        System.out.println(b << 1); // (<<)

        //2.Right Shift Operator (>>)
        int x = 6;
        int y = 0b110;
        System.out.print("2.Result is:- ");
        System.out.println(x >> 1);
        System.out.print("2.Result is:- ");
        System.out.println(y >> 1);

    }
}
