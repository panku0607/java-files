package EXAMS;
import java.util.*;

public class Array1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] marks = new int[5];
       for(int i = 0 ; i< marks.length ; i++){
        System.out.println("Enter the numbers at index: " + i );
        marks[i] = sc.nextInt();
        
       }
       System.out.println();

       for(int i  = 0 ; i<marks.length; i++){
        System.out.println("Enter the numbers at index " + i + ": " + marks[i]);
        
       }            
        }
    }

