package REVISION;

import java.util.*;

public class Function_Method {

    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }


    public static int calculateSum(int a, int b){ // formal parameters
        
        int sum = a + b;
        return sum;
        
    }

    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " +a);
        System.out.println("b =" +b);
    }

    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        
        int binCoeff =  fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    // function overloading
    // func to calculate sum of 2 nums

    // public static int sum(int a , int b){
    //     return a +b ;
    // }

    //     // func to calculate sum of 3 nums
    //  public static int sum(int a , int b, int c){
    //     return a +b + c;
    // }


        // func to call int sum
     public static int sum(int a , int b){
        return a + b ;
    }
        // func to call float sum
    public static float sum(float a, float b){
        return a + b ;

    }

    // public static boolean isPrime(int n){
    //    // corner case
    //    if(n==2){
    //     return true;
    //    }

    //     for(int i = 2; i < n-1 ; i++){
    //         if(n % i == 0){
    //             return false;
               
    //         }
    //     }
    //     return true;
    // }


        public static boolean isPrime(int n){

            if (n == 2) {
                return true;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i ==0) {
                    return false;
                }
            }
            return true;
        }

        public static void primeInrange(int n){
            for (int i = 2; i <=n; i++) {
                if(isPrime(i)){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }


        public static void binToDec(int binNum){
            int pow = 0;
            int decNum = 0;
            int myNum = binNum;

            while (binNum > 0) {
                int lastDigit = binNum % 10 ;
                decNum = decNum + (lastDigit *(int) Math.pow(2, pow));
                pow++;
                binNum = binNum / 10;
                }
                
                System.out.println("decimal of " + myNum + " = " + decNum);
        }


        public static void decToBin(int n){
            int pow = 0;
            int binNum = 0;
        
            int myNum = n;
            while (n > 0) {
                int rem = n % 2 ;
                binNum = binNum + (rem * (int) Math.pow(10, pow));
                pow++;
                n = n/2 ;
            }
            System.out.println("Binary of " + myNum + " = " + binNum);
        }


        public static float avgNo(int a, int b , int c){
            
            float avg =  (a+b+c)/3;
            
            return   avg;
        }

        public static boolean isEven(int n){
            if(n % 2 == 0){
                return true;
            }
            return false;
        }

        public static boolean isPalindrome(int n){
            
            int rev = 0;
            int num = n;
            while (num != 0) {
                int lastDigit = num % 10 ;
                rev = lastDigit + (rev * 10);
                num = num / 10;
            }

            if (n == rev) {
                return true;
            }

            return false;
        }

        public static int sumOfInteger(int n){
            int sum = 0;
            while (n != 0) {
              int  lastDigit = n %10;
                sum = sum + lastDigit;
                n = n/10;
            }
            return sum;
        }

    public static void main(String[] args) {
    
         Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //    int sum = calculateSum(a , b); // actual parameters
    //     System.out.println("The sum is: " + sum);


    // // SWap code
    //     int a = 5;
    //     int b = 10;
    //     swap(a, b);


    // System.out.println("a * b = " + multiply(  3, 5));
        
     //.out.println(factorial(5));

    //  System.out.println(binCoeff(5, 2));



    // System.out.println(sum(5, 3));
    // System.out.println(sum(5, 4, -2));

    // System.out.println(sum(2.5f, 3.13f));
    // System.out.println(sum(3, 6));

     //   primeInrange(100);

       // binToDec(111);
      
        //  decToBin(15);

        // System.out.println(avgNo(30, 40, 50));

        
        
        
        
        
        // System.out.println("Enter the number: ");
        // int n = sc.nextInt();
        // if(isEven(n)){
        //     System.out.println("it is even");
        // } else{
        //     System.out.println("it is odd");
        // }


            // WAP to check whether it is palindrome

            // int n = sc.nextInt();
           
            // if (isPalindrome(n) ) {

            //     System.out.print("Number  " + n + " is a palindrome");
            // } else {
            //     System.out.println("It is not a palindrome");
            // }


            // WAP To compute sum of digits in an integer
            System.out.println("Enter the Number: ");
            int n = sc.nextInt();
            System.out.println("The sum is: " + sumOfInteger(n));






}
}
