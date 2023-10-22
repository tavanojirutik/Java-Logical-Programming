package LogicalPrograming.PracticePoint;

public class Palandrom {
    public static void main(String[] args) {
        int num = 121;
        int rev = 0;
        int temp = num;
        int r ;

        while (num!=0) {
            r = num%10;
            rev = (rev*10) +r;
            num = num /10;
        }

        if (rev == temp) {
            System.out.println("Palindrom number");
        }else{
            System.out.println("Not Palindrom number ");
        }
    }
}
