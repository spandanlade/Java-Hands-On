package Operators;//Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the 4
// corresponding digits
// of the number TAKEN.
//For example, if the number which was taken is 5696, then the displayed number should be 7818.

import java.util.Scanner;

public class Assignments27 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int d4= no%10+2;
        int d3= no/10%10+2;
        int d2= no/100%10+2;
        int d1= no/1000%10+2;

        if(d4>=10)
            d4=d4/10;
        else if(d3>=10)
            d3=d3/10;
        else if(d2>=10)
            d2=d2/10;
        else if(d1>=10)
            d1=d1/10;


        d2=d1*10+d2;
        d3=d2*10+d3;
        d4=d3*10+d4;


        System.out.println(d4);

    }
}
