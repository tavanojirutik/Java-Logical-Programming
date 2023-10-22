package LogicalPrograming.Sorting;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        // int num[] = {2,45,65,77,87,8,23,56,76 ,};
        int num[] = {10,3,4,5,2,1,8,6,7};

        int n = num.length;
        System.out.println("Before Array : "+Arrays.toString(num));

        Arrays.sort(num);
        System.out.println("Sorted Array : "+Arrays.toString(num));

        // Finding The SecondLargestNumber element 
        int Highest = Integer.MIN_VALUE;
        int Smallest = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if (num[i]>Highest ) {
                Smallest = Highest;
                Highest = num[i];
            }

            if (num[i]!=Highest && num[i]>Smallest) {
                Smallest = num[i];
            }
        }
                    // System.out.println(num[n-2]);

        System.out.println("Second Largest Element is : "+num[n-2]);


    }
}
