//A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade
package If_else;

import java.util.Scanner;

public class Assignments44 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        if(marks<25){
            System.out.println("Your Grade is: F");
        }
        if(marks>=26 && marks<=45){
            System.out.println("Your Grade is: E");
        }
        if(marks>=46 && marks<=50){
            System.out.println("Your Grade is: D");
        }
        if(marks>=51 && marks<=60){
            System.out.println("Your Grade is: C");
        }
        if(marks>=61 && marks<=80){
            System.out.println("Your Grade is: B");
        }
        if(marks>=80){
            System.out.println("Your Grade is: A");
        }


    }
}
