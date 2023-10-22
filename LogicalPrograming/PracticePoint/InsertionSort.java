package LogicalPrograming.PracticePoint;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {2,3,55,64,1,33,43,5};

        int temp , j;
        System.out.println("After : "+Arrays.toString(a));

        for(int i=1;i<a.length;i++){
            temp = a[i];
            j=i-1;

            while (j>0 && a[j]>temp) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=temp;
        }
        System.out.println("Before : "+Arrays.toString(a));

    }
}
