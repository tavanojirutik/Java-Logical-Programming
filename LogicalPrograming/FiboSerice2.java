package LogicalPrograming;

import java.util.Scanner;

// IZ Inteview Quesion 
public class FiboSerice2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

       System.out.println("Enter The Number : ");
       int n = sc.nextInt();

        int first = 0, second = 1;
       for (int i = 1; i <= n; i++) {
           int temp = first + second;
           first = second;
           second = temp;
           if (second > n) {
            System.out.print(temp+" ");
            
           }

    }
}
}
