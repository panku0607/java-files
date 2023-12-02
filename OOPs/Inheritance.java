package OOPs;

public class Inheritance {
    public static void main(String[] args) {
        //single inheritance
       // Fish shark = new Fish();
       // shark.eat();

       //Multi level inheritance
    //    Dogs dobby = new Dogs();
    //    dobby.legs =4;
    //    dobby.breed = "huskies";
    //    System.out.println(dobby.legs);
    //    System.out.println(dobby.breed);

    // Hierarchical Inheritance

    }
}

// Multiples inheritance

class Animal{ // SuperClass

    String color;

    void eat(){
        System.out.println(" eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}

    class Mammals extends Animal{
        void walks(){
            System.out.println("Walks");
        }

    }
  

       // Derieved class
     class Fish extends Animal
    {
        int fins;
        void swim(){
            System.out.println("Swims in Water");
        }
       
    }
      class Dogs extends Animal{
        String breed;
        void sound(){
            System.out.println("Barks");
        }
    }

