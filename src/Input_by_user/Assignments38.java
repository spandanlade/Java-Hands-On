//Write a program to enter the values of two variables 'a' and 'b'
// from keyboard and then check if both the conditions 'a < 50' and 'a < b' are true.
package Input_by_user;

import java.util.Scanner;

public class Assignments38 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<50 && a<b){
            System.out.println("Both conditions are true");
        }
        }
    }
