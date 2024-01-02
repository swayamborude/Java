package Java.Operators;

public class assignment {
    public static void main(String[] args) {
        
        //1.(= Operator)
        int a = 10; //(=)
        System.out.println("1.Result:- " + a);

        //2.(+= Operator)
        int num1 = 10;
        int num2 = 20;
        num1 += num2; //(+=) This means num1 = num1 + num2
        System.out.println("2.Result:- " + num1);

        //3.(-= Operator)
        int y = 10;
        int z = 5;
        y -= z; //(-=) This means y = y - z
        System.out.println("3.Result:- " + y);

        //4.(*= Operator)
        int s = 10;
        int t = 20;
        s *= t; //(*=) This means s = s * t
        System.out.println("4.Result:- " + s);

        //5.(/= Operator)
        int r = 20;
        int i = 10;
        r /= i; //(/=) This measn r = r / i
        System.out.println("5.Result:- " + r);

        //6.(%= Operator)
        int m = 5;
        int n = 3;
        m %= n;
        System.out.println("6.Result:- " + m);
        
    }
    
}
