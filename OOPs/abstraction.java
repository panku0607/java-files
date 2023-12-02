package OOPs;

public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        // h.eat();
        // h.walk();
        // Chicken c = new Chicken();
        // c.walk();

        Mustang myHorse = new Mustang();
        System.out.println(h.color);
    }
}

abstract class Annimal {
    String color;

    Annimal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Eats food");
    }

    abstract void walk();
}

class Horse extends Annimal {
    Horse() {
        // super Keyword
        super.color ="Brown";
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "Dark green";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }

}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor Called ");
    }
}

// class Chicken extends Animal{

// void changeColor(){
// color = " yellow";
// }
// void walk(){
// System.out.println("Eats grain");
// }
// }
