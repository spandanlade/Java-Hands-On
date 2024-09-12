//Write a program to find square of a number.
//E.g.-
//INPUT : 2 OUTPUT : 4
//INPUT : 5 OUTPUT : 25
package Input_by_user;
import java.util.Scanner;

public class Assignments35 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no to find square of the number: ");
    int no = sc.nextInt();
    System.out.println("Square of the no is: "+no*no);
    }
}
