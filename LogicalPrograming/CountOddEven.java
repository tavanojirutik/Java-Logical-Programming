package LogicalPrograming;

// Count The Number Odd and Even 

public class CountOddEven {
    public static void main(String[] args) {
        long num = 7218912344l;
        int odd=0 , even=0;

        System.out.println("Input Number is : "+num);

        while (num!=0) {
            long rem = num % 10;
            if (rem %2 == 0) {
                    even++;
            }else{
                odd++;
            }
            num = num/10;
        }

        System.out.println("Even Number is : "+even);
        System.out.println("Odd Number Is : "+odd);
    }
}
