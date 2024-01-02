package Java;

import java.util.Scanner;

public class scanner_class {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //Create Scanner Class
        String name;
        int age;
        float CGPA;
        int roll_no;


        System.out.println("Enter your name:- ");
        name = sc.nextLine(); //Reads a String value from the user. (taking String input)

        System.out.println("Enter your age:- ");
        age = sc.nextInt(); 

        System.out.println("Enter your CGPA:- ");
        CGPA = sc.nextFloat();

        System.out.println("Enter your roll_no:- ");
        roll_no = sc.nextInt();

        System.out.println("Name=" + name);
        System.out.println("Age=" + age);
        System.out.println("CGPA=" + CGPA);
        System.out.println("Roll_No=" + roll_no);

    }
}
