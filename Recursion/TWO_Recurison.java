package Recursion;

import OOPs.interfaces;
import Strings.strings;

public class TWO_Recurison {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) { // Time complexity --->O(n) Space complexity ---> O(n)
        if (n == 0) {
            return 1;
        }
        // int fnm1 = factorial(n -1);
        int fn = n * factorial(n - 1);
        return fn;
    }

    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = calcSum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static int fib(int n) { // TC --> (2^n)
        if (n == 0 || n == 1) { // SC -- > O(n)
            return n;
        }
        int fn = fib(n - 1) + fib(n - 2);
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {
        if (arr[i] == arr.length - 1) { // TC -- > O(n)
            return true; // SC --> O(n)
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) { // TC --> O(n)
            return -1;
        }
        if (arr[i] == key) { // SC -- > O(n)
            return i;
        }

        return firstOccurance(arr, key, i + 1);
    }

    public static int lastOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int a, int n) { // (logn)
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static int tilingProblem(int n) { // 2 x n (floor size)
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // // kaam
        // // vertical
        // int fnm1 = tilingProblem(n - 1);

        // // horizontal
        // int fnm2 = tilingProblem(n - 2);
        // int totWays = fnm1 + fnm2;
        // return totWays;

        return tilingProblem(n-1) + tilingProblem(n-2);

    }

   
    public static void removeDuplicates(String str , int idx , StringBuilder newStr , boolean map[]){
        if(idx == str.length()){
           System.out.println(newStr);
           return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
           // duplicate
           removeDuplicates(str, idx + 1, newStr, map);
        }else{
           map[currChar - 'a'] = true;
           removeDuplicates(str, idx +1, newStr.append(currChar), map);
        }
     }


     public static int friendsPairing(int n){
        // base case
        if (n == 1 || n == 2) {
            return n;
        }
    //   //  kaam
    //     //choices
    //     // single
    //     int fnm1 = friendsPairing(n-1);

    //     // pair
    //     int fnm2 = friendsPairing(n-2);

    //     int pairWays = (n-1) * fnm2 ;
    //     int totWays = fnm1 + pairWays;

    //     return totWays;

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
     }

     public static void printBinStrings(int n , int lastPlace , String str){
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaa
        printBinStrings(n-1, 0, str + "0");
        if (lastPlace == 0){
            printBinStrings(n-1, 1, str+ "1");
        }
     }


     public static void allOccurance(int arr[] , int key , int idx){
       // base case
        if (idx == arr.length) {
            return ;
        }
        
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
         
         allOccurance(arr, key , idx +1);
        

     }

     public static void printDigits(int n){
       // base case 

       if (n == 0) {
        return;
       }
         // kaam
         String digits[] = {"zero", "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};

        int lastDigit = n % 10 ;
       
        printDigits(n / 10);
        System.out.print(digits[lastDigit] + " ");
        
            
        }

        public static int checkLength(String str){
            
            if ( str.length() == 0) {
                return 0;
            }

            // "pankaj Thakur"
            return checkLength(str.substring(1)) + 1 ;

           
            
        }

        public static int contiguousString(String str, int i , int j ,int n ){
            if(n == 1){
                return 1;
            }
            if (n <= 0) {
                return 0;
            }
            int res = contiguousString(str, i+1, j, n-1) + contiguousString(str, i, j-1, n-1) - contiguousString(str, i+1, j-1, n-2);

            if (str.charAt(i) == str.charAt(j)) {
                res ++ ;
            }
            return res;
        }

        public static void towerOfHanoi(int n , String src , String helper , String dest){
                //base case 
                if (n == 1) {
                     System.out.println("transfer disk " + n + " from " + src +" to " + dest);
                     return ;
                }
            towerOfHanoi(n-1, src, dest, helper);
            System.out.println("transfer disk " + n + " from " + src +" to " + dest);
            towerOfHanoi(n-1,helper, src, dest);

        }


     









    public static void main(String[] args) {
        // int n = 15 ;
        // printDec(n);
        // printInc(n);
        // System.out.println(factorial(n));
        // System.out.println(calcSum(n));
        // System.out.println(fib(n));

        // int arr[] = {1,2,3,5,4};
        // System.out.println(isSorted(arr, 0));

        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(firstOccurance(arr, 5, 0));

        // System.out.println(optimizedPower(2, 10));

        // System.out.println(tilingProblem(4));

        // String str = "appnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        // System.out.println(friendsPairing(4));

    //    printBinStrings(3, 0, "");

    // int arr[] = {3,2,4,5,6,2,7,2,2};
    // allOccurance(arr, 2, 0);

    // int n = 1947;
    //  printDigits(n);

    // String str = "pankaj Thakur";
    //     System.out.println(checkLength(str));

    // String str = "abcab";
    //     int n = str.length();
    // System.out.println(contiguousString(str, 0, n-1, n));
        towerOfHanoi(3, "S", "H", "D");

    }
}
