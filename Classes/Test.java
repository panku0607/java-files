package Classes;



            // METHOD OVERLOADING
class vehicle{
    void show(){
        System.out.println("hello ");
    }

    void show(int count){
        System.out.println(count);
    }
    void show(String name , String Type){
        System.out.println(name + Type);
    }
}



public class Test{
    public static void main(String [] args) {
        vehicle obj = new vehicle();
        obj.show();
        obj.show( 5);
        obj.show("audi"  +    " ",  " Supercar");
    }
}