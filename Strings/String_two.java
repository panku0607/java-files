package Strings;

import LOOPS.star;

import java.util.*;

public class String_two {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static boolean isPalindrome(String str) {

        for (int i = 0; (i < str.length() / 2); i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // north
            if (dir == 'N') {
                y++;
            }
            // east
            else if (dir == 'E') {
                x++;
            }
            // south
            else if (dir == 'S') {
                y--;
            }
            // west
            else {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);

    }

    // TC --> O(N * X ) where X is no. of letters
    public static String getLargest(String fruits[]) {
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        return largest;
    }


     public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        // char ch = Character.toUpperCase(str.charAt(0));
        // sb.append(ch);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length()-1 ) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();

     }


     public static String compress(String str){
        String newStr = "" ;

        for (int i = 0; i < str.length(); i++) {
                Integer count = 1;
                while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                    count ++ ;
                    i++ ;
                }
                newStr += str.charAt(i);
                if (count > 1) {
                    newStr += count.toString();
                }
        }
        return newStr;
        
     }





    public static void main(String[] args) {
        // char ch[] = {'a','b', 'c', 'd'};
        // String str = "pankaj Thakur";
        // String str2 = new String("xyz");

        // // Strings are immutable

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // // String length
        // String fullname = "Pankaj Thakur";
        // System.out.println(fullname.length());

        // // concatenation
        // String firstName = "Pankaj";
        // String lastName = "Thakur";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // System.out.println(fullName.charAt(12));
        // printLetters(fullName);

        // String str = "racecare";
        // System.out.print(isPalindrome(str));

        // String path = "WE";
        // System.out.println(getShortestPath(path));

        // String fruits[] = {"apple" , "mango" , "banana" , "papaya" , "kiwi"};
        // System.out.println(getLargest(fruits));

        // StringBuilder sb = new StringBuilder("");
        // for (char i = 'a'; i <= 'z'; i++) {
        //     sb.append(i);
        //     System.out.print(sb);
        // }



        // String str = " hii, i am pankaj thakur, i will Master DSA in 4 Month";
        //     System.out.println(toUpperCase(str));
        
        String str = "aaabbcccdd";
        System.out.println(compress(str));
        
        
    }
}
