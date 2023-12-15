package DAA;
import java.util.*;
import java.util.Arrays;

import ARRAYS.reverseArray;
import EXAMS.forEachLoop;
 public class Merg_Sort {


    public static int fact(int n){
        // base case
        if(n == 0){
            return 1;
        }
    return  n * fact(n-1);
 }

 public static int binFact(int n , int r){
    int fn = n *fact(n-1);
    int rn = r * fact(r-1);
    int fnmr = fact(n-r);

    int result = fn / (rn*(fnmr));

    return  result;
 }

 public static boolean isPrime(int n){
    // corner case
    if (n == 2) {
        return true;
    }
    boolean isPrime = true;
    for(int i = 2; i<=Math.sqrt(n) ; i++){
        if (n % i == 0) {
            isPrime = false;
            break;
        }
    }
    return isPrime;
 }

 public static void primeInRange(int n ){
    for(int i = 2 ; i <= n ; i++){
        if (isPrime(i)) {
            System.out.print(i + " ");
        }
    }
 }


 public static void searchPrimes(int n){

    for(int i = 0 ; i<= n ; i++){

        if (i == 0 || i == 1) {
            continue ;
        }

        int flag = 1 ;

        for(int j = 2 ; j <= i /2 ; j++){
            if (i % j == 0) {
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            System.out.print(i+ " ");
        }
    }
 }

 public static void binToDec (int n){

    int decNum =0;
    int pow = 0;
    int myNum =  n ;
  
    while (n != 0) {
      int  lastDigit = n % 10;
      
        decNum =  decNum + (lastDigit * (int) Math.pow(2, pow));
      
        n = n/10 ;
        pow++;

    }
    System.out.println("the Dec of :  " + myNum + " is " +  decNum );
 }


 public static void decTobin (int n){
    int pow = 0;
    int binNum = 0;
    int myNum = n ;

    while (n > 0) {
        int rem = n % 2 ;
        binNum = binNum + (rem * (int) Math.pow(10, pow));
        pow++;
         n = n / 2 ;
        
    }
    System.out.println("the Dec of :  " + myNum + " is " +  binNum );

 }


 public static int getLargest(int arr[]){
 int largest = Integer.MIN_VALUE;

 for (int i = 0; i < arr.length; i++) {
    //  largest = Math.max(largest, arr[i]);
    if (largest < arr[i]) {
        largest = arr[i];
    }
 }

 return largest;
 }

 public static void printArr(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
 }


 public static void reverseArr(int arr[]){

    int i = 0; 
    int j = arr.length-1 ;
    while (i <= j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp ; 

        i++ ;
        j-- ;
    }
 }

 public static void pairsArr(int arr[] ){

    for(int i = 0 ; i < arr.length ; i++ ){
        for(int j = i +1 ; j < arr.length ; j ++){
            System.out.print("(" + arr[i] + "," + arr[j] + ")");
        }
        System.out.println();
    }
 }

 public static void printSubarr(int arr[]){
    int currSum =0;
    int maxSum = Integer.MIN_VALUE;
    int ts = 0;
     for(int i = 0 ; i < arr.length ; i++ ){
        for(int j = i; j < arr.length ; j ++){
            currSum =0;
           for(int k=i ; k<= j; k++ ){
        //    System.out.print(arr[k] + " ");
        currSum += arr[k];
        
           }
           System.out.println(currSum);
        //    ts++;
            maxSum = Math.max(maxSum, currSum);
          
        }
        System.out.println();
        
 }
//  System.out.println("total subarr: " + ts);
System.out.println(maxSum);

        
 }


    public static void main(String[] args) {
    int arr[] = {2,4,6,8,10};
    // System.out.println(getLargest(arr));
    // reverseArr(arr);
    // printArr(arr);
            printSubarr(arr);
    
    
    
        
    }
}
