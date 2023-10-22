package LogicalPrograming.PracticePoint;

public class StringRev {
    public static void main(String[] args) {
        String str="Rutik";
        String rev="";
        char[] x= str.toCharArray();


        for(int i=x.length-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
