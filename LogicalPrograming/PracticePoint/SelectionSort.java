package LogicalPrograming.PracticePoint;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] n = {22,4,56,77,1,22,3,65,21};
        int temp =0 , min;
        System.out.println("Before Array : "+Arrays.toString(n));

        for(int i=0;i<n.length;i++){
            min = i;
            for(int j=i+1;j<n.length;j++){
                if (n[j]<n[min]) {
                    min=j;
                }
            }
            temp = n[i];
            n[i] = n[min];
            n[min] = temp;
        }
        System.out.println("Before Array : "+Arrays.toString(n));


    }
}
