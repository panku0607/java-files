package OOPs;

public class abstraction {
    public static void main(String[] args) {
     Horse h = new Horse();
     h.changeColor();
     System.out.println(h.color);
    }
}

abstract class Annimal {
    String color;
    Annimal(){
        System.out.println("animal constructor called");
    }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Annimal {

    Horse(){
        System.out.println("Horse constructor called");
    }

    void changeColor(){
        color = "dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs ");
    }
}


class Mustang extends Horse {
    Mustang (){
        System.out.println("Mustang constructro called");
    }
}
class Chicken extends Annimal {
    
    void changeColor(){
        color = "yellow";
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}


