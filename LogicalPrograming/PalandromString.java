package LogicalPrograming;

public class PalandromString {
    public static void main(String[] args) {
        String str ="MADAM" , temp ;
        String rev="";
        temp = str;

        char[] ch =str.toCharArray();

        for(int i=ch.length-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        if (temp.equals(rev)) {
            System.out.println("Palindrom String : "+rev);
        }else{
            System.out.println("Not Palindrom String : "+rev);
        }
        
    }
}
