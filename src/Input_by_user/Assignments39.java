//If the marks of Robert in three subjects are entered through
// keyboard (each out of 100 ), write a program to calculate his total marks and percentage marks.
package Input_by_user;

import java.util.Scanner;

public class Assignments39 {
    public static void main(String args[]){
    int s1,s2,s3;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks of three subjects: ");
    s1 = sc.nextInt();
    s2 = sc.nextInt();
    s3 = sc.nextInt();
    if((s1 & s2 & s3)<=100){
        float total_marks =s1 + s2 + s3;
        float percentage = (total_marks/300) *100f;
        System.out.println("Total marks = "+(int) total_marks+ " Percentage marks = "+percentage);
    }
}
}
