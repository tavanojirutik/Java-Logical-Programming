package LogicalPrograming;

public class MinimumAndMaximum {
    public static void main(String[] args) {
        int num[] = {10,3,4,5,2,1,8,6,7};
        int max = num[0];
        int min = num[0];
        for(int i=1;i<num.length;i++){
            if (num[i]>max) {
                max = num[i];
            }
        }
        System.out.println("Max Value is : "+max);

        for(int i=1;i<num.length;i++){
            if (num[i]<min) {
                min = num[i];
            }
        }
        System.out.println("Min Value : "+min);
    }
}
