package LogicalPrograming;

public class FindMissingNumber {
    public static void main(String[] args) {
        //Array Should not Dublicate
        //Array No Need To be Sorted Array
        //Value Should Be in a Range

        int a[]={1,2,3,4,5,6,7,8,10};

        //a= 1 ,2 , 4, 5 =12  sum1
        //a= 1 ,2 , 3, 4, 5 =13 sum2
        // sum1 - sum2 = Remaining Value 

        int sum1 =0 , sum2 =0;
        
        for(int i=0 ; i<a.length;i++){
            sum1 = sum1+a[i];
        }

        for(int i=1 ; i<=10 ;i++){
            sum2 = sum2+i;
        }

        // int missing = sum1 - sum2;

        System.out.println("Missing Value is : "+ (sum2 - sum1));



    }
}
