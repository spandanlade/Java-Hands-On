//A student will not be allowed to sit in exam if his/her attendance is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.
package If_else;

import java.util.Scanner;

public class Assignments47 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the classes held and classes you attended:");
        float classes_held = sc.nextFloat();
        float classes_attended = sc.nextFloat();
        float percentage = (classes_attended/classes_held)*100;
        String status="";
        System.out.println("Attendance of student in %age is: " +(int) percentage);
        if(percentage>=75)
            status = "Allowed";
        else
            status = "Not Allowed";
        System.out.println("Student is "+ status +" to sit in exam.");
    }
}
