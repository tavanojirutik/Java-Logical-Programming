package LogicalPrograming;
abstract class Bike{
    private String Bname;
    public void Bikex(String Bname){
        this.Bname =Bname;
        System.out.println("Bike Class Run : "+Bname);
    }
}

class Car extends Bike{
    private String Bname;

    public void Bikex(String Bname){
        this.Bname =Bname;
        System.out.println("Car Bike Class Run : "+Bname);
    }
    public void car(){
        System.out.println("Car Method ");
    }
}
class AbstractEx {
    public static void main(String[] args) {
    //    Bike b = new Car();
    // Bike b = new Car();
    Car b =new Car();

       b.Bikex("palsar"); 
       b.car();
    }
}
