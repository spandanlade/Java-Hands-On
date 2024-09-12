//Take two different string input and print them in same line. E.g.-
//INPUT : Codes
//Dope
//OUTPUT : CodesDope
package Input_by_user;

import java.util.Scanner;

public class Assignments36 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
    }
