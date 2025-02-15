// Find if there is a pair with a given sum in the rotated sorted Array
import java.util.*;

public class prog15 {
    public static boolean find(int arr[], int n){
        int x = arr.length;

        int pivot = 0;
        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                pivot = i+1;
                break;
            }
            }
            int left = pivot;
            int right = pivot - 1;
            while(left!=right){
                if(arr[left] + arr[right] == n){
                    return true;
                }
                else if(arr[left] + arr[right] < n){
                    left = (left+1) % x;
                }
                else{
                    right = (right-1+x)%x;
                }
            }
            return false;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {11, 15, 6, 8, 9, 10};
        System.out.println(find(arr, 16));
    }
}
