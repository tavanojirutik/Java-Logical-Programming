package LogicalPrograming;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
       int[] a={22,4,6,5,1,23,67,2};
        
       System.out.println("Before Array : "+Arrays.toString(a));

       int temp = 0; int i , j; int min=0;

       for( i=0;i<a.length;i++){
            min =i;
            for( j=i+1;j<a.length;j++){
                if (a[j]<a[min]) {
                    min = j;
                }
            }
                temp = a[i];
                a[i] = a[min];
                a[min] = temp;
       }

        System.out.println("After Array : "+Arrays.toString(a));
       

    }
}
