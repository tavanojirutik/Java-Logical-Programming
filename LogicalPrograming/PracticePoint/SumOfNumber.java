package LogicalPrograming.PracticePoint;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number ");
        int num = sc.nextInt();

        int sum = 0;
        int a[] = new int[num];

        for(int i=0 ; i<=num-1 ;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0 ;i<=num-1;i++){
            sum = sum + a[i];
        }

        System.out.println("Sum of Number is : "+sum);
        

        

    }
}
