package EXAMS;



public class Constructors {

    // Constructors(){
    //     System.out.println("hello ");
    // }

    public class student{
        int id;
        String name;
        student(int i , String n){
            id = i;
            name = n;
        }
        void display(){
            System.out.println(id + " " + name);
        }
    }
    public static void main(String[] args) {
      //  Constructors obj = new Constructors();
      student obj = new student(20, "Pankaj") ;
      obj.display();
    }
}
