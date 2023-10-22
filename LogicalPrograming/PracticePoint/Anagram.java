package LogicalPrograming.PracticePoint;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    static void Anagramx(String str1 ,String str2){
        char [] ch1 = str1.toCharArray();
        char[] ch2 =str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        Boolean status = Arrays.equals(ch1, ch2);

        if (status==true) {
            System.out.println("Its Anagram : " );
        }else{
            System.out.println("Not Anagram : ");
        }
    }

    public static void main(String[] args) {
       Anagramx("KEEP", "PEEK");
    }
}
