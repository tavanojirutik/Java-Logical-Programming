package LogicalPrograming;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 6;
        int sum =0;
        for(int i=1;i<n;i++){
            if (n%i==0) {
                sum = sum+i;
            }
        }
        if (n==sum) {
            System.out.println("Prefect Number : "+n);
        }else{
            System.out.println("Not Perfect Number : "+n);
        }
    }
}
