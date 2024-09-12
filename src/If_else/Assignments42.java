//A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.
package If_else;

import java.util.Scanner;

public class Assignments42 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();
        int total_cost = quantity *100;
        double discount_cost = total_cost - (0.10*total_cost);
        if(total_cost > 1000)
            System.out.println("Total Cost Discount cost is : "+discount_cost);
        else
            System.out.println("Total Cost is: "+total_cost);

    }
}
