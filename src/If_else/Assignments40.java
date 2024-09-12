//Take values of length and breadth of a rectangle from user and check if it is square or not.
package If_else;

import java.util.Scanner;

public class Assignments40 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        if(length == breadth)
            System.out.println("It is a Square.");
        else
            System.out.println("It is not a Square.");
    }
}
