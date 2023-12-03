package OOPs;

public class interfaces {
        public static void main(String[] args) {
        //    Queen q = new Queen();
        //    q.moves();

        Bear b = new Bear();
        b.eat();
        b.eatAnimal();

        }

}

// mutilple  inheritance

interface Carnivorous {
    void eatAnimal();
}

interface Herbivorous{
    void eat();
}

class Bear implements Herbivorous, Carnivorous{
    public void eat(){
        System.out.println("Eats grass and trees");
    }
    public void eatAnimal(){
        System.out.println("Eats animals");
    }
}



















   interface ChessPlayer{
    void moves();
   }

   class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right , left , diagonal, (in all direction)");
    }
   }

    class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right , left ,");
    }
   }

   
    class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right , left ,(by 1 step)");
    }
   }


    

