//Take two int values from user and print greatest among them.
package If_else;

import java.util.Scanner;

public class Assignments41 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}
