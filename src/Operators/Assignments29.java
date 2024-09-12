package Operators;

//Write a program to reverse a 3-digit number. E.g.-Number : 132 Output : 231
public class Assignments29 {
    public static void main(String args[])
    {
        int no=132,reverse=0;
        for(;no!=0;){
           int remainder = no %10;
            reverse = reverse * 10 +remainder;
            no = no/10;

        }
        System.out.println(reverse);
    }
}
