package OOPs;

public class Inheritance {
  public static void main(String[] args) {
    // // single inheritance
    // Fish shark = new Fish();
    // shark.eat();

    // // Multi level inheritance
    //   Dogs dobby = new Dogs();
    //   dobby.legs = 4;
    //   dobby.breed = "huskies";
    //   System.out.println(dobby.legs);
    //   System.out.println(dobby.breed);
    //   dobby.sound();
    

    // Hierarchical Inheritance


  }
}

// Multiples inheritance

class Animal { // SuperClass
  String color;

  void eat() {
    System.out.println("eats");
  }

  void breathe() {
    System.out.println("breathes");
  }

}

class Mammals extends Animal {
  int legs;
  void walks() {
    System.out.println("walks on legs");
  }

}

// Derieved class
// class Fish extends Animal
// {
// int fins;
// void swim(){
// System.out.println("swims in water");
// }
// }


class Dogs extends Mammals {
  String breed;

  void sound() {
    System.out.println("Barks");
  }
}

class Birds extends Animal {
  String breed;

  void sound() {
    System.out.println("Barks");
  }
}
