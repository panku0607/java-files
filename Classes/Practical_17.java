package Classes;
import java.util.Scanner;
public class Practical_17 {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        StringBuffer buffer = new StringBuffer(input);
        buffer.reverse();
 if (input.equals(buffer.toString())) {
 System.out.println("The given string is a palindrome.");
 } else {
 System.out.println("The given string is not a palindrome.");
 }
 }
}

       

