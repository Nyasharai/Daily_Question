// trapped rainwater
import java.util.*;
public class prog86 {
    public static int trap(int arr[], int n){
        if(n<=1){
            return 0;
        }
        int left[] = new int[n];
        int right[] = new int[n];
        int r = 0;
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        for(int i = 1; i < n; i++){
            left[i] = Math.max(arr[i], left[i-1]);
        }
        for(int i = n-2; i >= 0; i--){
            right[i] = Math.max(arr[i], right[i+1]);
        }
        for(int j = 0; j < n; j++){
            r += Math.min(left[j], right[j]) - arr[j];
        }
        return r;
    }
    public static void main(String[] args) {
        int arr[] = {3,0,0,2,0,4};
        System.out.print(trap(arr,6));
    }
}
