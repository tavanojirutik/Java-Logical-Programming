package LogicalPrograming.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {29,11,4,5,2,3,76};
        int temp;
        int n =a.length;

        System.out.println("Before : "+Arrays.toString(a));

        for(int i=0 ;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if (a[j]>a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }   
        }
        System.out.println("After : "+Arrays.toString(a));
    }
}
