package OOPs;

import EXAMS.Constructors.student;

public class Constructors {
    
    public static void main(String[] args) {
        Students s1 = new Students();
        // Students s2 = new Students("Pankaj");
        // Students s3 = new Students(123);
        // System.out.println(s2.name);
        // System.out.println(s3.roll);
        
        s1.name = "pankaj";
        s1.roll = 456;
        s1.password = "abcd";
       s1.marks[0] = 100;
       s1.marks[1] = 80;
       s1.marks[2]= 60;


        Students s2 = new Students(s1);
        s2.password = "xyz";
        System.out.println(s2.name);
       s1. marks[2] = 100;
        for(int i = 0 ; i < 3; i++){

            System.out.println(s2.marks[i]);
        }
       
    
    }
}
    // constructors
class Students{
    String name ;
    int roll;
    String password;
    int marks[];

// Non-parameterized constructors
    Students(){
        marks = new int[3];
        System.out.println("This is constructor");
    }
// parameterized constructors
    Students(String name){
        marks = new int[3];
        this.name = name;
    }
    Students(int roll){
        marks = new int[3];
        this.roll = roll;
    }
    //  shallow copy Constructors
    // Students(Students s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // Deep copy constructors
    Students(Students s1){
        marks = new int[3];
        this.name = s1.name;
        for(int i=0; i< marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    
    }

}
