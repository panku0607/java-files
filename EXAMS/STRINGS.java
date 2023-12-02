package EXAMS;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

// Main class
public class STRINGS {
    // Java program to demonstrate difference between
// String, StringBuilder and StringBuffer




	// Method 1
	// Concatenates to String
// 	public static void concat1(String s1)
// 	{
// 		s1 = s1 + "forgeeks";
// 	}

// 	// Method 2
// 	// Concatenates to StringBuilder
// 	public static void concat2(StringBuilder s2)
// 	{
// 		s2.append("forgeeks");
// 	}

// 	// Method 3
// 	// Concatenates to StringBuffer
// 	public static void concat3(StringBuffer s3)
// 	{
// 		s3.append("forgeeks");
// 	}

// 	// Method 4
// 	// Main driver method
// 	public static void main(String[] args)
// 	{
// 		// Custom input string
// 		// String 1
// 		String s1 = "Geeks";

// 		// Calling above defined method
// 		concat1(s1);

// 		// s1 is not changed
// 		System.out.println("String: " + s1);

// 		// String 1
// 		StringBuilder s2 = new StringBuilder("Geeks");

// 		// Calling above defined method
// 		concat2(s2);

// 		// s2 is changed
// 		System.out.println("StringBuilder: " + s2);

// 		// String 3
// 		StringBuffer s3 = new StringBuffer("Geeks");

// 		// Calling above defined method
// 		concat3(s3);

// 		// s3 is changed
// 		System.out.println("StringBuffer: " + s3);
// 	}
// }

// palindrime in string


// 	public static String isPalindrome(String str)
// 	{
// 		// Initializing an empty string to store the reverse
// 		// of the original str
// 		String rev = "";

// 		// Initializing a new boolean variable for the
// 		// answer
// 		// boolean ans =false ;

// 		for (int i = str.length() - 1; i >= 0; i--) {
// 			rev = rev + str.charAt(i);
// 		}

// 		// Checking if both the strings are equal
// 		if (str.equals(rev)) {
// 			  System.out.println("It is a palindrome");
// 		}
// 		else{
// 			System.out.println("It is  not a palindrome");
// 		}
// 	return str;
// 	}
// 	public static void main(String[] args)
// 	{
//         Scanner sc = new Scanner(System.in);

// 		// Input string
//         System.out.println("Enter the string:");
// 		String str = sc.nextLine();

// 		// Convert the string to lowercase
// 		//str = str.toLowerCase();
// 		String A = isPalindrome(str);
// 		System.out.println(A);
// 	}
// }

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int   rem , sum = 0;
	System.out.println("Enter the number:");
	int n = sc.nextInt();
	int temp = n;
	while(n>0){
		rem = n %10;
		sum = (sum*10) + rem;
		n = n/10; 
	}
	if(sum == temp){
		System.out.println("It is a palindrome");
	}
	else{
		System.out.println("It is not a palindrome");
	}
}
}



