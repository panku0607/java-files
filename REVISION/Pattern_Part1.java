package REVISION;

import java.util.*;

public class Pattern_Part1 {

    public static void hollow_rectangle(int totRows, int totCols) {
        // outer loop
        for (int i = 1; i <= totRows; i++) {
            // inner - columns
            for (int j = 1; j <= totCols; j++) {
                // cells (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void inverted_rotated_halfPyramid(int n){
            // outer loop
            for(int i = 1 ; i <= n ; i++){
                // space
                for(int j =1; j<= n-i ; j++){
                    System.out.print(" ");
                }
               
                // stars
                for(int k = 1; k <= i ; k++){
                    System.out.print("*");
                }
                
                System.out.println();
            }

        }

        public static void floyds_triangle(int n){
            int num = 1;
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j<= i; j++){
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
        }

        public static void zero_one_triangle(int n){
            for(int i = 1; i <= n ; i++){
                for(int j = 1 ; j <=i ; j++){
                    if((i+j) % 2 == 0){
                        System.out.print("1" + " ");
                    } else {
                        System.out.print("0" + " ");
                    }
                }
                System.out.println();
            }
        }


        public static void butterFly(int n){
            // 1st half
            for(int i = 1; i <= n; i++){
                // star
                for(int j =1; j <=i ; j++){
                    System.out.print("*");
                }
                // space
                for(int j = 1; j <= 2*(n-i); j++){
                    System.out.print(" ");
                }
                // star
                for(int j =1; j <=i ; j++){
                    System.out.print("*");
                }
                
                System.out.println();
            }

            // 2nd Half 
            for(int i = n; i >= 1; i--){
                // star
                for(int j =1; j <=i ; j++){
                    System.out.print("*");
                }
                // space
                for(int j = 1; j <= 2*(n-i); j++){
                    System.out.print(" ");
                }
                // star
                for(int j =1; j <=i ; j++){
                    System.out.print("*");
                }
                System.out.println();


            }
        }


        public static void solid_rhombus(int n){
            for(int i =1 ; i <= n ; i++){
                // space
                for(int j = 1; j <= n-i ; j++){
                    System.out.print(" ");
                }
                // star
                for(int j =1; j<=n; j++){
                    System.out.print("*");
                }

                System.out.println();
            }
        }


        public static void hollow_rhombus(int n){
            for(int i =1; i <= n; i++){
                //spaces
                for(int j = 1; j<= n-i ; j++){
                    System.out.print(" ");
                }
                for(int j =1; j <= n; j++){
                    if (i == 1 || i ==n || j == 1 || j == n) {
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }


        public static void diamond(int n){
            //1st half
            for(int i = 1; i <= n ; i++){
                // spaces
                for(int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }

                // star
                for(int j =1; j<= (2*i)-1; j++){
                    System.out.print("*");
                }
                System.out.println();

            }

            // 2nd half
            for(int i = n; i >= 1 ; i--){
                // spaces
                for(int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }

                // star
                for(int j =1; j<= (2*i)-1; j++){
                    System.out.print("*");
                }
                System.out.println();

            }

        }
        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Star Pattern
        // System.out.println("Enter the Number: ");
        // int n = sc.nextInt();
        // for(int i = 1; i <= n ; i++){
        // for(int j = 1; j <= i; j++){
        // System.out.print(i);
        // }
        // System.out.println();
        // }

        // // Inverted star
        // System.out.println("Enter the Number: ");
        // int n = sc.nextInt();

        // for(int i =1; i <= n ; i++){
        // for(int j =1; j <= n-i +1; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // // Half Pyramid Pattern
        // System.out.println("Enter the Number: ");
        // int n = sc.nextInt();
        // for(int i = 1; i <= n ; i++){
        // for(int j = 1; j <= i; j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // // Print Character Pattern

        // System.out.println("Enter the Number: ");
        // int n = sc.nextInt();
        // char ch = 'A';

        // //outer loop
        // for (int i = 1; i <= n; i++) {
        // for(int j = 1; j<= i; j++){
        // System.out.print(ch + " ");
        // ch++;
        // }
        // System.out.println();

        // }

        // hollow_rectangle(4, 5);
        // inverted_rotated_halfPyramid(4);
        // floyds_triangle(5);
        // zero_one_triangle(5);
        // butterFly(4);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        diamond(4);



    }
}
