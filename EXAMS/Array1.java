package EXAMS;
import java.util.*;

public class Array1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    //    int[] marks = new int[5];
    //    for(int i = 0 ; i< marks.length ; i++){
    //     System.out.println("Enter the numbers at index: " + i );
    //     marks[i] = sc.nextInt();
        
    //    }
    //    System.out.println();

    //    for(int i  = 0 ; i<marks.length; i++){
    //     System.out.println("Enter the numbers at index " + i + ": " + marks[i]);
        
    //    }    
       
    //     System.out.print(" Enter the input: ");
    //    int n = sc.nextInt();
      
    //     int arr[] = new int[n];
    //     for(int i = 0; i< arr.length ; i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     for(int i =0 ; i< arr.length ; i++){
    //         System.out.print(arr[i] + " ");
    //     }

   
        // int n = sc.nextInt();
        int arr[] = {};
        int count =1;
        for(int i = 1 ; i< arr.length ; i++){
            int j= 0;
            for( j =0 ; j< i ; j++ ){
                if(arr[i] == arr[j]){
                    break;
                }
            }
                
                if(i == j){
                    count++;
                }
        }
         System.out.println("there are " + count + " distinct elemnt ");
    }
        }
        
    

