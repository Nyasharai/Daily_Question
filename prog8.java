//Best Time to Buy and Sell Stock
import java.util.*;

class prog8 {
    public static int maxProfit(int[] prices) {
        int max = Integer.MAX_VALUE;
        int min = prices[0];
        int profit = 0;
    for(int i = 0; i < prices.length; i++){
        int cost = prices[i] - min;
        profit = Math.max(profit,cost);
        min = Math.min(min,prices[i]);
    }
    return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}