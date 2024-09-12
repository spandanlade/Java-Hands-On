//Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
package Input_by_user;

import java.util.Scanner;

public class Assignments32 {
    public static void main(String args[]){
        double length, breadth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of the rectangle: ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        System.out.println((int) (length*breadth));
    }
}
