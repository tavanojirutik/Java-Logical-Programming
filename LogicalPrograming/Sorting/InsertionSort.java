package LogicalPrograming.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {29,11,4,5,2,3,76};
        System.out.println("After : "+Arrays.toString(a));
        int temp , j;
        for(int i=1;i<a.length;i++){
            temp =a[i];
            j=i;

            while (j>0 && a[j-1]>temp) {
                a[j] = a[j-1];
                j = j-1;
            }
            a[j] = temp;
        }
        System.out.println("Before : "+Arrays.toString(a));
    }
}
