package LogicalPrograming;

public class xylem {
    public static void main(String[] args) {
        int num = 34326;
        int temp = num ;
        int innerNum = 0;
        int outerNum = 0;

        while(temp!=0) {
            if (temp==num || temp<10) 
                outerNum = outerNum + temp % 10;
            else
                innerNum = innerNum + temp % 10;    
                temp = temp / 10;
            
        }

        if (outerNum == innerNum) {
            System.out.println("Xylem Number : "+num);
        }else{
            System.out.println("Phloem Number : "+num);
        }
    }
}
