package REVISION;

import java.util.Scanner;

public class Conditional_Statement {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        
        // int age = 15;
        // if(age >= 18){
        //     System.out.println("Adult : drive, vote , Keep moving Forward");
        // }


        // if(age > 13 && age < 18){
        //     System.out.println("teenager");

        // }
        // else{
        //     System.out.println("Not Adult");
        // }


        // // Print The largest Of Two Numbers

        // int a = 10;
        // int b = 5;

        // if(a >= b){
        //     System.out.println("A is largeest of 2");
        // } else {
        //     System.out.println("B is larger than 2");
        // }


        // // print if no is even or Odd

        // int number = sc.nextInt();

        // if(number %2 == 0){
        //     System.out.println("EVEN");
        // } else{
        //     System.out.println("ODD");
        // }


        // // Income Tax Calculator

        // int income = sc.nextInt();
        // int tax ;

        // if(income < 500000){
        //     tax =0;
            
        // } else if(income >= 500000 && income < 1000000) {
        //     tax = (int) (income * 0.2);
            
        // } else{
        //     tax = (int) (income * 0.3);
            
        // }
        // System.out.println("Your tax is: " + tax);

        // // print largest of 3 

        // int a = 1; 
        // int b = 30;
        // int c = 6;

        // if((a >= b) && (a >= c)){
        //     System.out.println("A is greatest of 3");
        // }
        // else if(b >= c){
        //     System.out.println("B is greatest of 3");
        // }else{
        //     System.out.println("C is greatest of 3");
        // }




        // // Ternary Operator
        // int number = 4;
        // String result =(number%2 == 0) ? "even": "odd" ;
        // System.out.println(result);
       

        // int marks = 31;
        // String reportCard = (marks >= 33) ? "PASS" : "FAIL";
        // System.out.println(reportCard);


        // Switch Statement
        // int number = 2;
        // switch (number) {
        //     case 1 :System.out.println("Samosa");
        //         break;
        //     case 2 : System.out.println("VADAPAV");
        //         break;
        //     case 3 : System.out.println("PANIPURI");
        //         break;
        //     default: System.out.println("WE WAKE UP");
        //         break;
        // }


        // calculator
        //     System.out.println("Enter a");
        //     int a = sc.nextInt();
        //     System.out.println("Enter b");
        //     int b = sc.nextInt();
        //     System.out.println("Enter Operator: ");
        //     char operator = sc.next().charAt(0);
        // switch (operator) {
        //     case '+': System.out.println(a+b);
        //                 break;
        //     case '-': System.out.println(a-b);
        //                 break;
        //     case '*': System.out.println(a*b);
        //                 break;
        //     case '/': System.out.println(a/b);
        //                 break;
        //     default : System.out.println("No operation Found");
        //  }


        // int num = sc.nextInt();
        // if(num > 0){
        //     System.out.println("It is positive");
        // } else {
        //     System.out.println("It is negative");
        // }

        // double temp = 103.5;
        // if(temp > 100){
        //     System.out.println("you have fever");
        // } else{
        //     System.out.println("you are normal");
        // }


        // int number = 3;
        // switch (number) {
        //     case 1: System.out.println("MOnday");
        //         break;
        //     case 2: System.out.println("tueday");
        //         break;
        //     case 3: System.out.println("wednesday");
        //         break;
        //     case 4: System.out.println("thursday");
        //         break;
        //     case 5: System.out.println("friday");
        //         break;
        //     case 6: System.out.println("saturday");
        //         break;
        //     case 7: System.out.println("sunday");
        //         break;
        
        //     default:
        //         break;
        // }


        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = (year % 100 == 0) && (year % 400 == 0);

        if (x && (y || z)){
            System.out.println(year +" is a leap year");
        } else {
            System.out.println(year +" is not a leap year");
        }

        

    }
}
