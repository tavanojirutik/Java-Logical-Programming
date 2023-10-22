package LogicalPrograming;

public class ContNumber {
    public static void main(String[] args) {
        long num=72189123424343l;
        int count=0;

        while (num!=0) {
           num = num /10;
           count++; 
        }
        System.out.println("Number Of Digits is : "+count);
    }
}
