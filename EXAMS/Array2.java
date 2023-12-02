package EXAMS;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

//         // int arr [][] = {{1,2,3} , {4,5,6}, {7,8,9}} ;
//         // for(int i =0 ;i<3; i++){
//         //     for(int j = 0; j<3; j++){
//         //         System.out.print(arr[i][j] + " ");
//         //     }
//         //     System.out.println();

//         // }   

//     //     int arr[][] = new int [3][];
//     //     arr[0] = new int[3];
//     //     arr[1] = new int[4];
//     //     arr[2] = new int [2];


//     //     int count = 0;
//     //     for(int i =0 ; i<arr.length ; i++){
//     //         for(int j =0; j< arr[i].length; j++){
//     //             arr[i][j] = count++;
//     //         }
//     //     }
//     //     for(int i =0; i< arr.length; i++){
//     //         for(int j =0; j< arr[i].length; j++){
//     //             System.out.print(arr[i][j] + " ");
//     //         }
//     //         System.out.println();
//     //     }

   
  //adding of two matrices
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,1,1},{1,1,1},{1,1,1}};
        int c[][]=new int[3][3];
  
        for(int i = 0;i<3;i++){
           for(int j = 0;j<3;j++){
              c[i][j] = a[i][j]+b[i][j];
              System.out.print(c[i][j]+" ");
           }
           System.out.println();
        }
//             Scanner sc = new Scanner(System.in);
//         int rowA =3, colsA=3;
//         int rowB=3 , colsB=3;
//         int a[][]= new int [rowA][colsA];    
//         int b[][]=new int [rowB][colsB] ;
    
  
//         int c[][]=new int[rowA][colsB];  //3 rows and 3 columns  
    
//             System.out.println("Enter the matrix of A: ");
//         for(int i=0;i<rowA;i++){    
//             for(int j=0;j<colsA;j++){    
//                 a[i][j] = sc.nextInt();
//         }    
//         }
//         System.out.println("enter the matrix of B: ");
//         for(int i=0;i<rowB;i++){    
//             for(int j=0;j<colsB;j++){    
//                  b[i][j] = sc.nextInt();
//             }    
//             }
//             System.out.println();
//             System.out.println("\nThe matrix of C is: ");
//             for(int i=0;i<rowA;i++){    
//                 for(int j=0;j<colsB;j++){    
//                      c[i][j] = 0;
//                      for(int k = 0; k < colsA ; k++){
//                         c[i][j] += a[i][k]* b[k][j];
//                     }
//                      System.out.print(c[i][j] + " ");

//     }
//     System.out.println();  
//      }
//     }
// }
  

     


//   public static void main(String args[]) {
//     int row1, col1, row2, col2;
//     Scanner s = new Scanner(System.in);

//     // Input dimensions of First Matrix: A
//     System.out.print("Enter number of rows in first matrix: ");
//     row1 = s.nextInt();

//     System.out.print("Enter number of columns in first matrix: ");
//     col1 = s.nextInt();

//     // Input dimensions of second matrix: B
//     System.out.print("Enter number of rows in second matrix: ");
//     row2 = s.nextInt();

//     System.out.print("Enter number of columns in second matrix: ");
//     col2 = s.nextInt();

//     // Requirement check for matrix multiplication
//     if (col1 != row2) {
//       System.out.println("Matrix multiplication is not possible");
//       return;
//     }

//     int a[][] = new int[row1][col1];
//     int b[][] = new int[row2][col2];
//     int c[][] = new int[row1][col2];

//     // Input the values of matrices
//     System.out.println("\nEnter values for matrix A : ");
//     for (int i = 0; i < row1; i++) {
//       for (int j = 0; j < col1; j++) a[i][j] = s.nextInt();
//     }
//     System.out.println("\nEnter values for matrix B : ");
//     for (int i = 0; i < row2; i++) {
//       for (int j = 0; j < col2; j++) b[i][j] = s.nextInt();
//     }

//     // Perform matrix multiplication
//     // Using for loop
//     System.out.println("\nMatrix multiplication is : ");
//     for (int i = 0; i < row1; i++) {
//       for (int j = 0; j < col2; j++) {
//         // Initialize the element C(i,j) with zero
//         c[i][j] = 0;

//         // Dot product calculation
//         for (int k = 0; k < col1; k++) {
//           c[i][j] += a[i][k] * b[k][j];
//         }
        
//         System.out.print(c[i][j] + " ");
//       }
//       System.out.println();
//     }
  }
}

