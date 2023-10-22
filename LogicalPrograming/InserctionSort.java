package LogicalPrograming;
//Approch 1
import java.util.Arrays;

public class InserctionSort {
    public static void main(String[] args) {
        int[] a = {22,4,56,77,1,22,3,65,21};
        
        int temp , j;
        System.out.println("Before Array : "+Arrays.toString(a));

        for(int i=1;i<a.length;i++){
            temp = a[i];
            j=i-1;

            while(j>=0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }

            a[j+1] =  temp;
        }
        System.out.println("After Array : "+Arrays.toString(a));

        
    }
}
