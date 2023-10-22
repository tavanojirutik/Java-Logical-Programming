package LogicalPrograming;
//Cont word in a String 
public class WordCount {
    public static void main(String[] args) {
        String s= "Hello Public Wlecome ";

        // int count =1;


        //Approch 1
        // for(int i=0;i<s.length()-1;i++){
        //     if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')){
        //         count++;
        //     }
        // }
        // System.out.println("Word Count is : "+count);


        //Approch 2 // Its Short Approch 
        int total =  s.split("\\s").length;
        System.out.println(total);



    }
}
