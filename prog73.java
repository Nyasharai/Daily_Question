//count bst
import java.util.*;
public class prog73 {
    public static int count(int p){
        int dp[] = new int[p+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i < p+1;i++){
            for(int j = 0; j < i;j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[p];
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.print(count(n));
    }
}
