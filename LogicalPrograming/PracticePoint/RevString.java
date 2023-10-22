package LogicalPrograming.PracticePoint;

public class RevString {
    public static void main(String[] args) {
       
        String str = "R u t i k";
        String st = "";
        char[] ch=str.toCharArray();
        
        for(int i=ch.length-1 ; i>=0;i--){
            st = st+str.charAt(i);
        }

        System.out.println(st);


    }
}
