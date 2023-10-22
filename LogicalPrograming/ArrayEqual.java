package LogicalPrograming;

import java.util.Arrays;

public class ArrayEqual {
    public static void main(String[] args) {
        int a1[] = {10,20,30,40,50};
        int a2[] = {10,20,30,40,90};


        // Approch One 

        // boolean status = Arrays.equals(a1,a2);

        // if (status==true) {
        //     System.out.println("Array Are Equal : ");
        // }else{
        //     System.out.println("Array Are Not Equal : ");

        // }
        
        // Approch Two 

        boolean status = true;

        if (status==true) {

            for(int i=0;i<a1.length;i++){
                if (a1[i] != a2[i]) {
                    status=false;
                }else{
                    status = true ;
                }
            }
            
        }else{
            status = false;
        }

        if(status == true){
            System.out.println("Array Is Equal : ");
        }else{
            System.out.println("Array is Not Equal : ");
        }


    }
}
