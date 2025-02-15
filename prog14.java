// Find Minimum in Rotated Sorted Array
// import java.util.*;

// public class prog14 {
//     public static int Mini(int arr[], int n){
//         Arrays.sort(arr);
//         return arr[0];
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = {4,5,6,7,0,1,2};
//         int n = arr.length;
//         System.out.println(Mini(arr,n));
//     }
// }

import java.util.*;

public class prog14 {
    public static int Mini(int arr[], int n){
        int start = 0;
        int end = n-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid] > arr[end]){
                start = mid+1;
            }
            else 
            {
                end = mid;
            }
        }
        return arr[start];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,5,6,7,0,1,2};
        int n = arr.length;
        System.out.println(Mini(arr,n));
    }
}


