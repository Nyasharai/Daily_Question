//0-1 knapsack problem(tabulation) 
import java.util.*;
public class prog49 {
    public static void print(int dp[][]){
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int knapsackTab(int val[], int wt[], int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j < dp[0].length; j++){
            dp[0][j] = 0;
        }
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < W+1; j++){
                int v = val[i-1];
                int w = wt[i-1];
                if(w<=j){
                    int incprofit = v + dp[i-1][j-w];
                    int excprofit = dp[i-1][j];
                    dp[i][j] = Math.max(incprofit,excprofit);
                }
                else{
                    int excprofit = dp[i-1][j];
                    dp[i][j] = excprofit;
                }
            }
        }
        print(dp);
        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        System.out.print(knapsackTab(val,wt,W));
    }   
}
