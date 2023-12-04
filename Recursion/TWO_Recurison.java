package Recursion;



public class TWO_Recurison {


    public static void printDec(int n){
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc (int n){
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n){ // Time complexity --->O(n) Space complexity ---> O(n)
        if (n == 0) {
            return   1;
        }
        // int fnm1 = factorial(n -1);
        int fn = n * factorial(n-1);
        return fn;
    }

    public static int calcSum(int n){
        if (n == 1) {
            return 1 ;
        }
        int Snm1 = calcSum(n -1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static int fib(int n ){
        if (n == 0 || n == 1) {
            return n ;
        }
        int fn = fib(n -1) + fib(n-2);
        return fn ;
    }










    public static void main(String[] args) {
        int n = 5 ;
        // printDec(n);
        // printInc(n);
    //    System.out.println(factorial(n)); 
        //   System.out.println(calcSum(n));
        System.out.println(fib(n));



    }
}
