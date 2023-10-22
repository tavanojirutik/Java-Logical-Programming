package LogicalPrograming;

public class StringRev {
    public static void main(String[] args) {
        String str = "A N K I T A";
        String rev = " ";
        char[] ch=str.toCharArray();

        // for(int i=ch.length-1;i>=0;i--){
        //     rev = rev + str.charAt(i);
        // }

        StringBuffer sb =new StringBuffer(str);
            System.out.println(sb.reverse());

        // System.out.println(rev);
    }
}
