package LogicalPrograming;

public class AramstrongNumber {
    public static void main(String[] args) {
        int num = 153   ;
        int t1=num;
        int lengt =0;

        while (t1!=0) {
            t1 = t1/10;
            lengt = lengt+1;
        }
        int t2 = num;
        int rem;
        int arm =0 ,nul=1;
        while (t2!=0) {
            rem = t2%10;
            for(int i=1;i<=lengt;i++){
                nul = nul*rem;
            }
              arm = arm+nul;
              t2=t2/10;
        }
        if (arm==num) {
            System.out.println("Amastring num");
        }else{
            System.out.println("Not Amastrong ");
        }
    }

}
