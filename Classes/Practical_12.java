package Classes;
import java.util.Scanner;

    
    interface A {
        void methodA();
       }
       interface B {
        void methodB();
       }
       class C implements A, B {
        public void methodA() {
        System.out.println("Method A of Class C");
        }
        
        public void methodB() {
        System.out.println("Method B of Class C");
        }
       }
       public class Practical_12 {
        public static void main(String[] args) {
        System.out.print("Enter a number (1 for Method A, 2 for Method B): ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        C obj = new C();
 
 switch (choice) {
 case 1:
 obj.methodA();
 break;
 case 2:
 obj.methodB();
 break;
 default:
 System.out.println("Invalid Choice");
 break;
 }
 }
}

       

