package ARRAY_List;

import java.lang.annotation.Target;
import java.util.ArrayList;

public class Classrooms {

    public static int storeWater( ArrayList <Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp =height.size()-1;
        while(lp < rp){
            
            int ht = Math.min(height.get(rp), height.get(lp));
            int width = rp - lp ;
           int currWater =  ht * width;
           maxWater = Math.max(maxWater, currWater);


           //update ptr
           if(height.get(lp) < height.get(rp)){
            lp++;
           } else {
            rp--;
           }
        }
        return maxWater;
    }

    //     // Brute force O(n^2)
    // public static boolean pariSum1(ArrayList <Integer> list  , int target){
    //     for(int i = 0; i < list.size(); i++){
    //         for(int j = 0; j < list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // 2 pointer Approach O(n)
    public static boolean pariSum1(ArrayList <Integer> list  , int target){
        int lp = 0 , rp = list.size()-1;
        while(lp < rp){
            // Case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            //case 2
            if(list.get(lp) + list.get(rp) < target){
                lp++ ;
            } //case 3 
            else{
                rp--;
            }
        }
        return false;
    }

    // pair sum  (2 pointer approach) --> O(n)
    public static boolean pariSum2(ArrayList <Integer> list2 , int target){
        int bp = -1 ;
        int n = list2.size();
        for(int i =0 ; i < list2.size() ; i++){
            if(list2.get(i) > list2.get(i + 1)){
                bp = 1; 
                break;
            }
        }
        int lp = bp +1 ;
        int rp = bp;

        while(lp != rp){

            if(list2.get(lp) + list2.get(rp) == target){
                return true;
            }

            //case 2
            if(list2.get(lp) + list2.get(rp) < target){
                    lp = (lp +1) % n;
            } else{
                rp = (n + rp-1) % n;
            }
        }

        return false;
    }



    public static void main(String[] args) {
        // ArrayList <Integer> height = new ArrayList<>();

        // // 1,8,6,2,5,4,8,3,7

        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);

        // System.out.println(storeWater(height));



        // ArrayList <Integer> list = new ArrayList<>();

        // // 1 , 2 , 3 ,4 , 5 ,6 
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // int target = 50;
        // System.out.println(pariSum1(list, target));


        ArrayList <Integer> list2 = new ArrayList<>();
        // 11,15,6,8,9,10  - Sorted and Rotated
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        int target = 16;
        System.out.println(pariSum2(list2, target));
    
    }
}


