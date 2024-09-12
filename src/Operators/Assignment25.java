package Operators;//The total number of students in a class are 90 out of which 45 are boys.
//
//If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program
// to calculate the total number of girls getting grade 'A'.
import java.util.*;
public class Assignment25 {
    public static void main(String args[]){
        int total_no_of_students = 90;
        int no_of_students_getting_A_grade = 90/2;
        int no_of_boys_getting_A_grade = 20;
        int no_of_girls_getting_A_grade  = no_of_students_getting_A_grade - no_of_boys_getting_A_grade;
        System.out.println(no_of_girls_getting_A_grade);
    }
}