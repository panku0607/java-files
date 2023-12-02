
package EXAMS;
import java.util.Arrays;
import java.util.*;

public class Array_3 {
 public static int largest(int numbers[]){
    int min = Integer.MAX_VALUE;
    for(int i =0; i< numbers.length; i++){
        if(min > numbers[i]){
            min = numbers[i];
        }
    }
    return min;
 }

    
    public static void main(String[] args) {
        // Write a Java program to sort a numeric array and a string array.

        // int marks[]  = {256,8,489,67,43,12,10,777,143};
        // Arrays.sort(marks);
        // System.out.println(Arrays.toString(marks));
        int numbers[] = {2,4,5,3,0,6};
        System.out.println("minimun value is : " + largest(numbers));
    }
}
