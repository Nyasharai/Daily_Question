// kth smallest element

import java.util.*;

public class prog18 {
    public static int small_Ele(int arr[], int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {7,10,4,3,10,15};
        System.out.println(small_Ele(arr, 3));
    }
}