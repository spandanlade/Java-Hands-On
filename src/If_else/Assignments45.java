//Take input of age of 3 people by user and determine oldest and youngest among them.
package If_else;

import java.util.Scanner;

public class Assignments45 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age1,age2,age3;
        System.out.println("Enter the ages: ");
        age1 = sc.nextInt();
        age2 = sc.nextInt();
        age3 = sc.nextInt();
        String oldest ="";
        String youngest ="";
        if(age1<age2) {
            youngest = "age1";
            if (age1 > age3)
                youngest = "age3";
        }
        else{
            youngest = "age2";
            if(age2>age3)
                youngest = "age3";
            }
        if(age1>age2) {
            oldest = "age1";
            if (age1 < age3)
                oldest = "age3";
        }
            else{
                oldest = "age2";
                if(age2<age3)
                    oldest = "age3";
            }
            System.out.println("Youngest : "+youngest);
        System.out.println("Oldest : "+oldest);
        }





    }
