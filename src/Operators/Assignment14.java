package Operators;

//Length and breadth of a rectangle are 5 and 7 respectively.
//Write a program to calculate the area and perimeter of the rectangle.
public class Assignment14 {
    public static void main(String args[]){
        int length, breadth;
        length = 7;
        breadth = 5;
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        System.out.println("Area of rectangle is : "+ area + "  Perimeter of the rectangle is : " + perimeter);

    }
}