//A company decided to give bonus of 50% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.
package If_else;

import java.util.Scanner;

public class Assignments43 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your salary and year of experience in years");
       int salary = sc.nextInt();
       float exp = sc.nextFloat();
       if(exp>5)
           System.out.println("Your net Bonus is: " + (float) salary*0.5);
       else
           System.out.println("Your net bonus is: 0");

    }
}
