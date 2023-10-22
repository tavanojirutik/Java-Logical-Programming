package LogicalPrograming;

public class RevNum {
    public static void main(String[] args) {
        long num =7218912344l , temp;

        // while (num!=0) {
        //     temp = num%10;
        //     rev = rev*10 +temp;
        //     num = num/10;
        // }


        // Using String Buffer 

        // StringBuffer sb =new StringBuffer(String.valueOf(num));
        // StringBuffer rev = sb.reverse();

        // Using String Builder 

        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder rev=sb.reverse();

        System.out.println(rev);
    }
}
