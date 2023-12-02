package REVISION;


public class Array_2 {
      public static int buySellStock(int prices[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]){
              int profit = prices[i] - buyPrice;
              maxProfit = Math.max(maxProfit, profit);
            } else{
              buyPrice = prices[i];
            }
        }
        return maxProfit;
      }
      
      public static int rainWater (int height[]){
        int n = height.length;
        int leftMax[] = new int [n];
         leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] =new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i>= 1; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int rainWater = 0 ;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(rightMax[i], leftMax[i]);

            rainWater += waterLevel - height[i];
        }

        return rainWater;
      }



      


    public static void main(String[] args) {
      int prices[] = {7,6,4,3,1};
      System.out.println(buySellStock(prices));


      // int height[] = {4,2,0,3,2,5};
      // System.out.println(rainWater(height));





    }
}
