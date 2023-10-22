package LogicalPrograming;

public class SumOfNumberArray {
    public static void main(String[] args) {
        int num[] ={1,2,3,4,5,6,7};
        int sum =0;

        // for(int i=0;i<=num.length-1;i++){
        //     sum = sum+num[i];
        // }

        for(int value:num){
            sum = sum+value;
        }
        System.out.println(sum);

    }
}
