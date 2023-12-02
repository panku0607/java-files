package Classes;

class vehicle{
    protected String brand = "Audi";
    public void sample(){
        System.out.println("Audi is a subbrand");
    }
}

class car extends vehicle{
    public String model = "A7";
        
}
public class inheritance {
    public static void main(String[] args) {
        car obj = new car();
        obj.sample();
        System.out.println(obj.brand + " " + obj.model + " is a success");
        
    }
}
