package LogicalPrograming;

public class Palandrom {
    public static void main(String[] args) {
        int num = 458,temp;
        int rev =0;
        int r;
        temp = num;

        while (num!=0) {
            r=num % 10;
            rev = (rev * 10) + r;
            num = num/10;
        }

        if(temp == rev){
            System.out.println("Palandrom Number "+rev);
        }else{
            System.out.println("Not Palandrom Number "+rev);
        }
    }
}
