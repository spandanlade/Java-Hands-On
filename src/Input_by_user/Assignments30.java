package Input_by_user;

import java.util.Scanner;

//Write a program to take two integer inputs from user and print sum and product of them.
public class Assignments30 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two nos");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of the given nos is:  "+ (a+b));
        System.out.println("Product of the two nos is : "+(a*b));

    }
}
