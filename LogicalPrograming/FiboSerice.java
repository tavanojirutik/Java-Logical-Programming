package LogicalPrograming;

import java.util.Scanner;

//Fibonacci series
public class FiboSerice {
    public static void main(String[] args) {
        int n1 =0 , n2 =1 , temp=0;

        System.out.println(n1+"  "+n2);

        for(int i=2;i<10;i++){
            temp = n1+n2;
            System.out.print(" "+ temp);
            n1 = n2;
            n2 = temp;
        }
    }
}
