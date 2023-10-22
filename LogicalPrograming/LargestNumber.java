package LogicalPrograming;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Numner : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Numner : ");
        int b = sc.nextInt();
        System.out.println("Enter the Third Numner : ");
        int c = sc.nextInt();

        if (a>b && a>c) {
            System.out.println("First Number is Gratter : "+a);
        }else if(b>a && b>c){
            System.out.println("Second Number is Gratter : "+b);
        }else{
            System.out.println("Third Number is Gratter : "+c);
        }


    }
}
