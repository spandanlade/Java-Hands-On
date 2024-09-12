package Operators;

//If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ),
// write a program to calculate his total marks and percentage marks.
public class Assignment22 {
    public static void main(String args[]){
        int  math = 78, science = 45, english = 62;
        int total_marks = math + science + english;
        float percentage_marks =(float) (total_marks)/300*100;
        System.out.println("Total marks = "+ total_marks + " Percentage marks = "+ percentage_marks + "%");

    }
}
