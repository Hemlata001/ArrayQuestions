import java.util.*;
public class Buy_SellStock {
    public static int buy_sell(int[] prices){
        int buyprices = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = prices.length;
        for(int i = 0;i<n;i++){
            if(buyprices<prices[i]){
                int profit = prices[i] - buyprices;
                maxProfit =Math.max(maxProfit,profit);
            }else{
                buyprices = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buy_sell(prices));
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
