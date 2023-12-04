package OOPs;

public class OOPS_TWO {
    public static void main(String[] args) {
        Pencil p1 = new Pencil(); // new object created in heap memory
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(6);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        // HDFCBank myAcc = new HDFCBank();
        // myAcc.username = "Pankaj Thakur";
        // myAcc.setPassword("I will surpass me");
        // System.out.println(myAcc.username);
        // System.out.println(myAcc.getPassword());

//         Faculty s1 = new Faculty();
//         // System.out.println(s1.name);

//         // Faculty s2 = new Faculty("Pankaj Thakur");
//         // System.out.println(s2.name);

//         // Faculty s3 = new Faculty("pankaj Monika" , 25);
//         // System.out.println(s3.name + " " + s3.roll);

//         s1.name = "Pankaj";
//         s1.roll = 445;
//         s1.password = "abcd";
//         s1.marks[0] = 100;
//         s1.marks[1] = 70;
//         s1.marks[2] = 90;

//         Faculty s2 = new Faculty(s1);
//         s2.password = "xyz";

//         s1.marks[0] = 150;
//         for (int i = 0; i < 3; i++) {
//             System.out.println(s2.marks[i]);
//         }

//     }
 }

// class Faculty {
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     Faculty() {
//         marks = new int[3];
//         System.out.println("Faculty  ");
//         // this.name = name;
//     }

//     // deep copy constructor
//     Faculty (Faculty s1){
//         marks = new int[3];
//         this.name = s1.name;
//          this.roll = s1.roll;
//          for (int i = 0; i < marks.length; i++) {
//                 this.marks[i] = s1.marks[i];
//          }

//     }

    // Faculty (String name){
    // this.name = name;
    // }
    // Faculty(String name , int roll){
    // this.name = name ;
    // this.roll = roll;
    // }

    // // Shallow copy constructor
    // Faculty (Faculty s1){
    // this.name = s1.name;
    // this.roll = s1.roll;
    // marks = new int[3];
    // this.marks = s1.marks;
    // }

}

class Pencil {

    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip; // this is used to refer the current object
        // it is used when we have same variable names
    }

    void setColor(String Color) {
        this.color = Color; // this.color is of pen class varialbe
        // color is of outsidepen class variable ;
    }

    void setTip(int Tip) {
        this.tip = Tip;
    }
}

class HDFCBank {
    public String username;
    private String password;

    void setPassword(String pwd) {
        password = pwd;
    }

    String getPassword() {
        return this.password;
    }
}
