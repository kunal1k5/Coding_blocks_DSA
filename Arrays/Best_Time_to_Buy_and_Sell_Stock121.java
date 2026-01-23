package Arrays;

public class Best_Time_to_Buy_and_Sell_Stock121 {

    public static void main(String[] args) {
        
    }

    public static int maxProfit(int[] prices){
        int n = prices.length;
        int min = prices[0];
        int max = 0;

        for(int i=0; i<n; i++){
            int cost = prices[i] - min;
            max = Math.max(max,cost);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
    
}
