package LogicalPrograming;

import java.util.Random;

public class GenerateRandomNumberAndString {
    public static void main(String[] args) {
        Random ran = new Random();
        // int get = ran.nextInt(100);
        Double get = ran.nextDouble(10);
        System.out.println(get);

        System.out.println(Math.random());
    }
}
