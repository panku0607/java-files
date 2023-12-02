package Classes;

public class KNAPSACK {
    
    public static void knapSack(int num , int capacity, int weight, int profit){

    }

    public static void main(String[] args) {
     int capacity = 20;
     int num = 6; 
     int ratio[];
     int[] profit = {90,60,50,80,100,70} ;
     int[] weight = {2,5,10,5,2,1};
     for(int i = 0; i<num; i++){
        int ratio[i] = profit[i]/weight[i];

     }

     // Swapping the Number
     for(int i = 0; i < num;i++){
        for(int j = 0; j< num-i-1; j++){
            if(ratio[j] < ratio[j+1] ){

                ratio[i] = ratio[j+1];
                weight[i] =  weight[j+1];
            }

        }
     }
    }
}
