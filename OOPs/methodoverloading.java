package OOPs;

import javax.sql.rowset.spi.SyncResolver;

public class methodoverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 4));
        System.out.println(calc.sum((float) 2.5, (float) 1.5));
        System.out.println(calc.sum(4, 3, 6));

        bird b1 = new bird();
        b1.eat();
    }
}


// method overriding
class Animal{
        void eat(){
            System.out.println("eats animal");
        }
}
class bird extends Animal{
    void eat(){
        System.out.println("eats bird");
    }
}

class Calculator{
    int sum(int a , int b){
        return a +b ;
    }
    float sum(float a , float b){
        return a + b;
    }
    int sum(int a , int b , int c){
        return a +b + c;
    }
}
