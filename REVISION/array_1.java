package REVISION;
import java.util.*;



public class array_1 {

    public static void update(int marks[] , int nonchangeable){
        nonchangeable = 10;
        for(int i=0 ; i< marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

        public static int linearSearch(int numbers[] , int key){
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == key) {
                    return i;
                }
            }
            return -1;
        }
        public static int linearSearch(String menu[] , String key){
            for (int i = 0; i < menu.length; i++) {
                if (menu[i] == key) {
                    return i;
                }
            }
            return -1;
        }

        public static int getLargest(int numbers[]){
            int largest = Integer.MIN_VALUE;
            int samllest = Integer.MAX_VALUE;

            for (int i = 0; i < numbers.length; i++) {
                if (largest < numbers[i]) {
                    largest = numbers[i];
                }

                if (samllest > numbers[i]) {
                    samllest = numbers[i];
                }
            }
            System.out.println("smallest value is: " + samllest);
            return largest;
        }


    
    public static void main(String[] args) {
        
        // // array declaration and initialization
        // int marks[] = new int [50];
        // int newMarks[] = {2,3,4};

        // // array input
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy: " + marks[0]);
        // System.out.println("chem: " + marks[1]);
        // System.out.println("maths: " + marks[2]);

        // // marks[2] = marks[2] + 2;
        // // System.out.println("newmaths marks: " + marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2])/3;
        // System.out.println("percentage = " + percentage);
        // System.out.println(marks.length);

        // int marks[] = {97,98,96};
        // int nonchangeable = 5;
        // update(marks, nonchangeable);
        // System.out.println(nonchangeable);
        // for (int i = 0; i < marks.length; i++) {
        //      System.out.print(marks[i] + " ");
        // }




        // // Linear Search
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int key = 20;
        // int index = linearSearch(numbers, key);
        // if (index == -1) {
        //     System.out.println("Key Not Found");
        // } else{
        //     System.out.println("Key is at index: " + index);
        // }

        // // linear search for string

        // String menu[] = {"samosa" , "vadapav" , "dhabeli" , "aloo chat" , "jalebi" };
        // String  key = "jalebi";
        // int index = linearSearch(menu, key);

        // if (index == -1) {
        //     System.out.println("dish Not Found");
        // } else{
        //     System.out.println("dish is at index: " + index);
        // }
        


            // // Program to find largest in an array

            int numbers[] = {-1,-2,-3,-4,-5};
             System.out.println("largest value is: " + getLargest(numbers) );



            


    }
}