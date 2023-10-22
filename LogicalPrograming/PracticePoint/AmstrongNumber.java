package LogicalPrograming.PracticePoint;

public class AmstrongNumber {
    public static void main(String[] args) {
       int num = 9926315;
       int temp = num;
       int rem , sum=0; int leng =0;

       while (temp !=0) {
        rem = temp%10;
        temp = temp/10;
        // sum = sum+rem*rem*rem;
        leng = leng+1;
        for(int i =1;i<=leng;i++){
            sum = sum + rem* leng;
        }
       }

       if (num == sum) {
        System.out.println("Amstrong");
       }else{
        System.out.println("Not Amstrong");
       }
    }
}
