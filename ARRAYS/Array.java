package ARRAYS;
import java.util.*;

public class Array {
    public static void update(int marks[]){
        for(int i =0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int marks[] = {45,46,47};
        // int marks[] = new int[100];

        // marks[0] = sc.nextInt(); // physics
        // marks[1] = sc.nextInt(); // maths
        // marks[2] = sc.nextInt(); // chemistry

        // System.out.println("phy: " + marks[0]);
        // System.out.println("maths: " + marks[1]);
        // System.out.println("chem:  " + marks[2]);
        // System.out.println();
       // System.out.println("lenght of an array: " + marks.length);
       update(marks);
       for(int i =0 ; i< marks.length; i++){
            System.out.println(marks[i] + " ");
            
       }


    }
}
