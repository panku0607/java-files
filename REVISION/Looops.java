package REVISION;

import java.util.Scanner;

public class Looops {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     int counter = 1 ;
    //    while (counter <= 10) {
    //     System.out.println(counter);
    //     counter++;
    //    }

        // int range = sc.nextInt();
        // int counter = 1;
        // while (counter <= range) {
        //     System.out.print(counter + " ");
        //     counter++;
            
        // }

        // sum of n numbers
        // int sum =0;
        // int n = 5;
        // int i=1;
        // while (i <= n) {
        //     sum += i;
        //     i++;
            
        // }
        // System.out.println("the sum is: " + sum);


        // // For loop
        // for(int line = 1; line <=4 ; line++){
        //     System.out.println("****");
        // }


        // // print reverse of a number
        // int n = 10899;
        // int rev = 0;
        //     while (n >0) {
        //         int lastDigit = n % 10;
        //         rev = (rev * 10) + lastDigit;
        //          n /= 10;
        //     }
        //     System.out.println(rev);
            
        
        
            
            //  do {
            //     System.out.print("Enter the number: ");
            //  int n = sc.nextInt();
            //  if(n % 10 == 0){
            //     break;
            //  }
            //  System.out.println(n);
            //  } while (true);

          
          
            // // check if a number is prime or not

            // int n = sc.nextInt();
            //     if(n==2){
            //         System.out.println("n is prime");
            //     } else{
            //             boolean isPrime = true;
            // for(int i = 2; i <= Math.sqrt(n); i++){
            //     if(n % i == 0){
            //         isPrime = false;
            //     }
            // }

            // if(isPrime == true){
            //     System.out.println("n is prime");
            // } else{
            //     System.err.println("n is not prime");
            // }
            //     }






            // // WAP That raeds a set of integers, and then prints the sum of the even and odd

            //   int n ;
              
            //   int evenSum =0;
            //   int oddSum = 0;
            //     for(int i = 1; i <= 5; i++){
            //         System.out.println("Enter the Number: " + i);
            //          n = sc.nextInt();

            //          if (n % 2 ==0) {
            //             evenSum += n;
            //         } else{
            //             oddSum += n;
            //         }
            //     }

            //     System.out.println("Sum of even no. is: " + evenSum);
            //     System.out.println("Sum of odd no. is: " + oddSum);



            // // WAP to find the factorial of any Number entered by the user

            // int fact = 1;
            // System.out.print("Enter the Number: ");
            // int n = sc.nextInt();
            // for (int i = 1; i <= n; i++) {
            //     fact *= i;
            // }
            // System.out.print("The factorial is: "+ fact);


            // WAp to print the Multiplication table of a number N, entered by the user

            System.out.print("Enter The No of which You want a table: ");
            int n = sc.nextInt();
            int table;

            for (int i = 1; i <= 10; i++) {
                table = n * i ;
                System.out.println(table);
            }
                
       
     }
}
