package Classes;

import java.util.Scanner;

public class PRACTICAL_18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        // System.out.println("Enter the character: ");
        // String b = sc.nextLine(); 
        System.out.println();
        

        int characters = name.length();
 int words = name.split("\\s+").length;
 int lines = name.split("\n").length;
 System.out.println("Number of characters: " + characters);
 System.out.println("Number of words: " + words);
 System.out.println("Number of lines: " + lines);
    }
}
