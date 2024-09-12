package Operators;

//Suppose the values of variables 'a' and 'b' are 6 and 8 respectively, write two programs to swap the values of the two variables.
//
//1 - first program by using a third variable
//
//2 - second program without using any third variable
//
//( Swapping means interchanging the values of the two variables E.g.- If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)
public class Assignment23 {
    public static void main(String args[]){
        // 1st Method
        int a = 6, b = 8;
        int c;
        System.out.println("Before Swapping "+ a +" " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping " + a + " " + b);

        // 2nd Method
        int e =6 , d = 8;
        System.out.println("Before Swapping "+ e +" " + d);
        e = e + d;
        d = e - d;
        e = e - d;
        System.out.println("After Swapping " + e + " " + d);
    }
}