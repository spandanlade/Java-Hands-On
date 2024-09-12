package Operators;

//Now solve the above question[assignment - 20] to check if at-least one of the conditions 'a < 50' or 'a < b' is true.
public class Assignment21 {
    public static void main(String args[]){
        int a = 55, b = 70;
        System.out.println((boolean) (a<50 || a<b));
    }
}
