package LogicalPrograming;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String as = "Rutik       tavanoji        2000";

        String x=as.replaceAll("\\s", "");

        System.out.println("Before String : "+as);
        System.out.println("After String : "+x);
    }
}
