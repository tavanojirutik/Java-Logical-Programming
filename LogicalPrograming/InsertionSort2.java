package LogicalPrograming;

import java.util.Arrays;

public class InsertionSort2 {
    public static void main(String[] args) {
        int[] a={45,2,4,5,11,4,6,7,8,};
        int temp , j;

        System.out.println("Before Array : "+Arrays.toString(a));
        for(int  i=1;i<a.length;i++){
            temp= a[i];
            j=i;

            while (j>0 && a[j-1]>temp) {
                a[j]=a[j-1];
                j=j-1;
            }
            a[j] = temp;

        }
        System.out.println("After Array : "+Arrays.toString(a));

    }
}
