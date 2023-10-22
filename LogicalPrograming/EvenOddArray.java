package LogicalPrograming;

public class EvenOddArray {
    public static void main(String[] args) {
        int num[] ={1 ,2,3,5,6,7};

        System.out.println("Even");
        for(int i=0;i<num.length;i++){
            if(num[i] % 2 ==0)
                System.out.println(num[i]);
        }

        System.out.println("Odd Number");
        for(int i=0;i<num.length;i++){
            if(num[i] % 2!=0)
                System.out.println(num[i]);
        }
    }
}
