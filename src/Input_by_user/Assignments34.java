//Take side of a square from user and print area and perimeter of it.
package Input_by_user;


import java.util.Scanner;

public class Assignments34 {
    public static void main(String args[]){
        float side;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side value of the square:");
        side = sc.nextFloat();
        float area = side * side;
        float perimeter = 4 * side;
        System.out.println("Area of Square is: "+area+". Perimeter of the Square is: "+ perimeter);
    }
}
