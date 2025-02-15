//min array jump
import java.util.*;
public class prog71 {
    public static int min(int arr[]){
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        dp[n-1] = 0;
        for(int i = n-2; i >= 0;i--){
            int ans = Integer.MAX_VALUE;
            int step = arr[i];
            for(int j = i+1; j <n && j <= step+i;j++){
                if(dp[j] != -1){
                    ans = Math.min(dp[j]+1,ans);
                }
            }
            if(ans != Integer.MAX_VALUE){
                dp[i] = ans;
            }
        }
        return dp[0];
    }
    public static void main(String[] args) {
        int num[] = {2,3,1,1,4};
        System.out.print(min(num));
    }
}
