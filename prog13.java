// Maximum Product Subarray
import java.util.*;

public class prog13 {
    public static int maxProduct(int arr[], int n){
        int maxFinal = arr[0]; // Initialize maxFinal with the first element
        int max = arr[0]; // Initialize max with 1
        int min = arr[0]; // Initialize min with 1
        for(int i = 1; i < n; i++){ // Start loop from 1
            if(arr[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(arr[i], arr[i] * max);
            min = Math.min(arr[i], arr[i] * min);

            maxFinal = Math.max(maxFinal, max);
        }
        return maxFinal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-2,0,-1};
        int n = arr.length;
        System.out.println(maxProduct(arr,n));
    }
}

