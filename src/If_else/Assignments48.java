//Modify the above question to allow student to sit if he/she has medical cause.
// Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
package If_else;

import java.util.Scanner;

public class Assignments48 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("You Have a medical cause?.(Y or N)");
        String status = sc.next();

        if(status.equals("Y") || status.equals("y"))
            status = "Allowed";
        else
            status = "Not Allowed";
        System.out.println("Student is "+ status +" to sit in exam.");
    }
}
