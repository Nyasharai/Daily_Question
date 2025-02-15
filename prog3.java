// Maximum-Subarray sum
import java.util.*;

public class prog3 {
        public static int maxSubArray(int[] nums) {
            int n = nums.length;
            int sum = 0;
            int max = Integer.MIN_VALUE;
    
            for(int i = 0; i < n; i++){
                sum+= nums[i];
                max = Math.max(sum,max);
    
                if(sum<0) sum = 0;
            }
            return max;
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,4,-1,7,8};
        System.out.print(maxSubArray(arr));
    }
}
