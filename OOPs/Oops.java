package OOPs;

import Strings.strings;

public class Oops {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("Violet");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());

        // p1.setColor("yellow");
        // System.out.println(p1.getColor());




        bankAccount myAcc = new bankAccount();
        myAcc.username = "vcbachg";
        myAcc.setPassword("Pankaj Thakur");
        System.out.println(myAcc.username);
        System.out.println(myAcc.getPassword(null));
        
    }
}

class Pen{
    // Getters and Setters Methods
   private String color;
    private int tip;

    String  getColor(){
        return this.color;
    }

    int getTip(){
       return  this.tip ;
    }
    
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int tip){
       this.tip = tip;
    }
}









class bankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
     
    public String getPassword(String pwd){
        return password;
    }
}

