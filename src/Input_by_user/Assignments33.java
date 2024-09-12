//Take name, roll number and field of interest from user and print in the format below :
//Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
package Input_by_user;

import java.util.Scanner;

public class Assignments33 {
    public static void main(String args[]){
       String name,interest;
       int roll_no;
       System.out.println("Enter your name, roll no and field of Interest");
       Scanner sc = new Scanner(System.in);
       name = sc.next();
       roll_no = sc.nextInt();
       interest = sc.next();
       System.out.println("Hey, my name is "+name+" and my roll number is "+roll_no+". My field of interest are "+interest);
    }
}
