//Matrix multiplication recursion
import java.util.*;
public class prog68 {
    public static int mcm(int arr[],int i,int j){
        if(i==j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k = i; k <= j - 1; k++){
            int cost1 = mcm(arr,i,k);
            int cost2 = mcm(arr,k+1,j);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalcost = cost1 + cost2 + cost3;
            ans = Math.min(ans,finalcost);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        int n = arr.length;
        System.out.print(mcm(arr, 1, n-1));
        // n length n-1 matrices
        //
        // Ai = arr[i-1] * arr[i]
        //k=i to j-1
        //int mcm(arr[],int i, int j) i=1 j = n-1
        // for k=i to j-1
        // cost1 = mcm(arr,i,k) arr[i-1] * arr[k]
        //cost2 = mcm(arr,k+1,j) arr[k] * arr[j]
        //Ai = arr[i-1] * arr[i]
        //cost3 = arr[i-1] * arr[k] * arr[j] abd
        //final cost = cost1 + cost2 + cost3
        //ans = min(ans,final cost)
    }
}
