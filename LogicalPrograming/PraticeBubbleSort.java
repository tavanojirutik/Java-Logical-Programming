package LogicalPrograming;

import java.util.Arrays;

public class PraticeBubbleSort {
    public static void main(String[] args) {
        int a[] = {22,56,7,877,53,45};
        
        int n =a.length;

        System.out.println("Before Array : "+Arrays.toString(a));

        //Bubble Sort Code 

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if (a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.println("Before Array : "+Arrays.toString(a));

    }
}
