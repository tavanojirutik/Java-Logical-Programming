package LogicalPrograming.PracticePoint;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
       int[] a={22,4,6,5,1,23,67,2};
        int n =a.length; 
        int temp =0;
        System.out.println("Beore Array : "+Arrays.toString(a));

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if (a[j]>a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
         System.out.println("Beore Array : "+Arrays.toString(a));

        
        
    }
}
