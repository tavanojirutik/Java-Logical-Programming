package LogicalPrograming.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {29,11,4,5,2,3,76};
        int temp,min=0;
        System.out.println("After : "+Arrays.toString(a));

        for(int i=0;i<a.length;i++){
            min =i;
            for(int j=i+1;j<a.length;j++){
                if (a[j]<a[min]) {
                    min =j;
                }
                temp = a[i];
                a[i] = a[min];
                a[min] =temp;
            }
        }
        System.out.println("Before Array : "+Arrays.toString(a));

    }
}
