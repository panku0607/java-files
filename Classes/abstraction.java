package Classes;
abstract class Bike{
    abstract void bike_cc();
    public void sample(){
        System.out.println("INSIDE ABSTRACT CLASS");
    }
}

class ducati extends Bike{
    public void bike_cc(){
        System.out.println("ducati is 1100cc");
    }
}
public class abstraction {
    public static void main(String[] args) {
        ducati obj = new ducati();
        obj.bike_cc();
        obj.sample();
    }
}
