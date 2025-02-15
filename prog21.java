// longest subarray sum divisible by k
import java.util.*;

public class prog21 {
    public static int longestSum(int arr[], int k){
        int maxSum = 0;
        for(int i = 0; i < arr.length; i++){
            int currSum = 0;
            for(int j = i; j < arr.length; j++){
                currSum += arr[j];
                if(currSum % k == 0){
                    maxSum = Math.max(maxSum, j - i + 1);
                }
            }
            
        }
        return maxSum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,7,6,1,4,5};
        int k = 3;
        System.out.println(longestSum(arr,k));
    }
}