package Classes;
class bike{
    public void bike_cc(){
        System.out.println("bike range from 1 to 100 cc");
    }
}
class Ducati extends bike{
    public void bike_cc(){
        System.out.println("bike range from 100 to 150 cc");
    }
}
class yamaha extends bike{
    public void bike_cc(){
        System.out.println("bike range from 160 to 200 cc");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        bike obj1 =new bike();
        ducati obj2 = new ducati();
        yamaha obj3 = new yamaha();
        obj1.bike_cc();
        obj2.bike_cc();
        obj3.bike_cc();
    }
}
