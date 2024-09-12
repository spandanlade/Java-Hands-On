package Operators;

//- Write a program to add 8 to the number 2345 and then divide it by 3.
//- Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5.
//- Display the final result.
public class Assignment16 {
    public static void main(String args[]){
        int no = 2345;
        int res = no + 8;
        res = res / 3;
        res = res % 5;
        res = res * 5;
        System.out.println(res);
    }
}
