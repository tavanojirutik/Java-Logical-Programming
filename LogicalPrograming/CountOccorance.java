package LogicalPrograming;

//Number Of Repet The paticular Character 

public class CountOccorance {
    public static void main(String[] args) {
        String s ="Hello Public How Are You";

        int totalCount = s.length();
        int totalCount1 = s.replace("l", "").length();

        int total = totalCount-totalCount1;
        System.out.println("Number Of Time L Is Repit in a String : "+total);

        
    }
}
