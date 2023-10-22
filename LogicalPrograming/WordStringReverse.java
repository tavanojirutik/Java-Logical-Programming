package LogicalPrograming;
//Reverse Each Word in a String 
public class WordStringReverse {
    public static void main(String[] args) {
        String s ="How To Reverse Each Word in a String";

        String[] word = s.split(" ");

        String rev="";

        for(String w:word){
            String revx= "";

            for(int i=w.length()-1;i>=0;i--){
                revx=revx+w.charAt(i);
            }

            rev = rev+revx+" ";
        }

        System.out.println(rev);
    }
}
