package LogicalPrograming;

// 5 = 1*2*3*4*5 = 120
//5! = 5*4*3*2*1 =120

public class Factorial {
    public static void main(String[] args) {
        int n=5,fact=1;
        

        // Assinding Order 
        // for(int i=1;i<=n;i++){
        //     fact = fact*i;
        // }
        // System.out.println("Assinding Order Factorial Number : "+fact);


        //Desinding Order 
        for(int i=n;i>=1;i--){
            fact = fact*i;
        }
        System.out.println("Descding Order Factorial Number : "+fact);
    }
}
