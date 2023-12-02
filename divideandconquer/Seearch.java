package divideandconquer;

import javax.print.attribute.standard.RequestingUserName;

public class Seearch {
    
    public static int search(int arr[] , int tar , int si , int ei ){

        if( si > ei){
            return -1 ;
        }
        //kaam
        int mid = si + (ei - si)/2;

        // case FOUND
        if(arr[mid] == tar){
            return mid;
        }

        // mid on L1
        if(arr[si] <= arr[mid]){
            // case A : left
            if(arr[si] <= tar &&  tar <= arr[mid]){

            return search(arr, tar, si, mid -1);
            }

            //Case B : right
            else{
               return  search(arr, tar, mid +1, ei);
            }

        }

          // mid on L2
        else{
            //  case c : right
            if(arr[mid] <= tar && tar <= arr[ei]){

                return search(arr, tar, mid +1, ei);
            }else{

                return search(arr, tar, si, mid -1);
            }



        }

    }


    public static int Comeon(int arr[] , int tar ){

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == tar){
                return i ;
            }
        }
        return -1 ;
    }


    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
      System.out.println("target is at index : " + Comeon(arr, target));


        // int tarIdx = search(arr, target, 0, arr.length -1);
        // System.out.println(tarIdx);
    }
}
