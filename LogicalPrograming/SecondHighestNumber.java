package LogicalPrograming;

import java.util.Arrays;

public class SecondHighestNumber {
    public static void main(String[] args) {

        // FIrst Approch 

        // int num[] = {2,45,65,77,87,8,23,56,76};
        int num[] = {2,45,65,77,87,8,23,56,76 ,77};
        int n = num.length;

        // System.out.println("Before Array : "+Arrays.toString(num));

        // Arrays.sort(num);
        // System.out.println("Second Largest Element is : "+ num[n-2]);


        //Approch 2
        int Highest = Integer.MIN_VALUE;
        int Smallest = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if (num[i]>Highest ) {
                Smallest = Highest;
                Highest = num[i];
            }

            if (num[i]>Highest && num[i]<Smallest) {
                Smallest = num[i];
            }
        }
                    System.out.println(num[n-2]);


    }
}
