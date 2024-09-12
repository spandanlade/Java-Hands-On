//Write a program to print absolute value of a number entered by user. E.g.-
//INPUT: 1 OUTPUT: 1
//INPUT: -1 OUTPUT: 1
package If_else;

import java.util.Scanner;

public class Assignments46 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find absolute value");
        int no = sc.nextInt();
        System.out.println("Absolute value of "+no +" is " +Math.abs(no));

    }
}
