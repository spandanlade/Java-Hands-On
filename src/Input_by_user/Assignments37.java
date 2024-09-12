//Take 3 inputs from user and check :
//all are equal
//any of two are equal
package Input_by_user;

import java.util.Scanner;

public class Assignments37 {
        public static void main(String args[]){
          int a,b,c;
          Scanner sc = new Scanner(System.in);
          a = sc.nextInt();
          b = sc.nextInt();
          c = sc.nextInt();
          if(a==b && a==c){
              System.out.println("All are Equal");
          }
          if((a==b && b!=c) || (b==c && c!=a) || (c==a && a!=b) ){
              System.out.println("Any two of three are equal.");
          }
        }
}
