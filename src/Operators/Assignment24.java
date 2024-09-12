package Operators;//Write a program to convert Fahrenheit into Celsius.
import java.util.*;
public class Assignment24 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in Fahrenheit ");
        float n = sc.nextInt();
        n = n-32f;
        float b = 5/9f;
        n *= b;
        System.out.println("Converted value in celcius is :"+ n);

    }
}