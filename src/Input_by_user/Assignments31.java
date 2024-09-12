package Input_by_user;

import java.util.Scanner;

//1. Take two integer inputs from user.
//2. First calculate the sum of two then product of two.
//3. Finally, print the sum and product of both obtained results.
public class Assignments31 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two nos");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        int product = a*b;
        System.out.println("Sum of the given nos is:  "+sum);
        System.out.println("Product of the two nos is : "+product);

    }
}

