package LogicalPrograming;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortBuildInArray {
    public static void main(String[] args) {
        Integer a[] = {22,56,7,877,53,45};
        // int a[] = {22,56,7,877,53,45};
        
        //Approch 1
        // System.out.println(Arrays.toString(a));
        // Arrays.sort(a);
        // System.out.println(Arrays.toString(a));

        //Approch 2
        // System.out.println(Arrays.toString(a));
        // Arrays.parallelSort(a);
        // System.out.println(Arrays.toString(a));
        
        //Approch 3 (Reverse order) Note Its Not A Support Primitive Data 
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));

    }
}
