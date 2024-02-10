package OOPs;

import java.util.Scanner;

  class Complex {
    int real ;
    int imag;

    Complex(int r , int i){
      real = r;
      imag = i;  
    }
    public static Complex add(Complex a , Complex b){
        return new Complex ((a.real + b.real), (a.imag + b.imag));
    }
    public static Complex diff(Complex a , Complex b){
        return new Complex ((a.real - b.real), (a.imag - b.imag));
    }
    public static Complex product(Complex a , Complex b){
        return new Complex (((a.real * b.real)- (a.imag * b.imag)),((a.imag * b.real)+(a.real * b.imag)));
    }

    public  void printComplex(){
       
         if(real == 0 && imag != 0){
             System.out.println(imag + "i");
         }
         else if(imag == 0 && real != 0){
             System.out.println(real);
         }
         else{
             System.out.println(real + " " + imag + "i");
         }
     }

   
}


public class AtmCard {
    private String cardNumber;
    private String userName;
    private String Address;
    private int number;
    private String password;

    // Constructor
    public AtmCard(String cardNumber, String userName, String Address, int number, String password) {
        this.cardNumber = cardNumber;
        this.userName = userName;
        this.Address = Address;
        this.number = number;
        this.password = password;
    }

    // Getter methods
    public String getCardNumber() {
        return cardNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String Address() {
        return Address;
    }

    public int number() {
        return number;
    }

}




 class practice {

 
    public static void main(String[] args) {
       
        
        // Complex c = new Complex(4,0);
        // c.printComplex();

        AtmDetails atm = new AtmDetails();
        
        atm.username = "Pankaj Thakur";
        
        atm.setPassword("124512pankaj");
        
        System.out.println(atm.getpassWord());

        atm.Address = " Vrundavan chowkdi Wageshwari Society ";

        
        
        
        
    }
}








