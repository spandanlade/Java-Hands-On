package Lets_program;

public class Assignment03 {
    public static void main(String args[]){
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            i--;
            System.out.println();
        }
        for(int i=3;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            i++;
            System.out.println();
        }
    }
}
