package ARRAYS;
import java.util.*;

public class trapwater {
    public static int trappedRainWater(int height[]){
    // caculate  left max boindary array 
    int n = height.length;

int leftMax[] = new int[n];
     leftMax[0] = height[0];
     for(int i =1 ; i< n ; i++){
        leftMax[i] = Math.max(height[i], leftMax[i-1]);
     }

    //calculate right max boundary - array
    int rightMax[] = new  int [n];
    rightMax[n-1] = height[n-1];
    for(int i =n-2; i>=0 ; i-- ){
        rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }

    int trappedWater = 0;
    for(int i=0; i< n; i++){
        int waterlevel = Math.min(leftMax[i], rightMax[i]);

        trappedWater += waterlevel - height[i];
    }
    return trappedWater;
}


public static int buyAndSell(int prices[]) {
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int i=0; i< prices.length ; i++){
        if(buyPrice < prices[i]){
            int profit = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        else{
            buyPrice = prices[i];
        }
    }
    return maxProfit;
}

public static boolean checkcopy(int numbers[]){

    for(int i =0; i<numbers.length ; i++){
        for(int j= i +1; j < numbers.length ; j++ ){
            if(numbers[i] == numbers[j]){
                return true;
            }

        }
    }
    return false;
}



public static int search(int[] nums , int target){
    int min = search(nums);

    if(nums[min] <= target && target <= nums[nums.length -1]){
        return search(nums, min , nums.length-1 ,target);
    }
    else{
        return search(nums , 0 , min, target);
    }
}

public static int search(int[] nums , int left , int right, int target){
    int l = left;
    int r = right;

    while(l <=r){
        int mid = l + (r - l)/2;
        if(nums[mid] == target){
            return mid ;
        }
        else if(nums[mid] > target){
            r = mid -1 ;
        }
        else{
            l = mid + 1;
        }
    }
    return -1 ;
}


public static int search(int nums[]){
    int left = 0; 
    int right = nums.length -1;
    while(left < right){
     int mid = left + (right - left)/2;
     if(mid > 0 && nums[mid -1] > nums[mid]){
         return mid ;
     }
     else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
         left = mid +1;
     }
     else{
         right = mid-1;
     }
    }
    return left;
    
 }


 public static int profitSell(int[] prices){
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int i = 0; i < prices.length ; i++){
        if(buyPrice < prices[i]){
            int profit = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
         else{
            buyPrice = prices[i];
        }
    }
    return maxProfit;
}


public static int buildingWater(int height[]){
    int n = height.length;
    int leftMax[] = new int[n];
      leftMax[0] = height[0] ;
    for(int i =1 ; i < n  ; i++){
        leftMax[i]= Math.max(height[i], leftMax[i-1]) ;
    }

    int rightMax[] = new int[n];
    rightMax[n-1] = height[n-1];
    for(int i = n-2; i>= 0 ; i--){
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }

    int trappedWater = 0;
    for(int i = 0 ; i< n ; i++){
        int waterlevel = Math.min(leftMax[i], rightMax[i]);
        trappedWater += waterlevel - height[i];
    }
    return trappedWater;
}







public static void main(String[] args) {
    int height[] = {4,2,0,6,3,2,5};
    System.out.println(trappedRainWater(height));

    // int prices[] = {7,1,5,3,6,4};
    // System.out.println("The Max profit is at Day :" + buyAndSell(prices)); 

    // int numbers[] = {1,2,6,4,5,6};
    // System.out.println(checkcopy(numbers)); 

    // target search  dsa Qno 6
//     int nums [] = {0,1,2,4,5,6,7};
//     int target = 4;
//     search(nums);
//     search(nums, target);
//    int find = search(nums, left, nums.length -1, target);
//    System.out.println(find);

    //// Dsa sheet Qno. 8
// int prices[] = { 7,6,4,3,1};

// System.out.println(profitSell(prices));

// int height[] = { 0,1,0,2,1,0,1,3,2,1,2,1};
// System.out.println(buildingWater(height));

    // int numbers[] = { -1 , 0, 1, 2, -1, -4};
    
    



    


   

}
}