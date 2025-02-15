import java.util.*;

public class prog17 {
    public static boolean find(int arr[], int n){
        int x = arr.length;
        int pivot = 0; 
        int left = 0;
        int right = x-1;
        for(int i = 0; i < n; i++){
            if(arr[i] < arr[i+1]){
                pivot = i+1;
                break;
            }
        }
            while(left!=right){
                if(arr[left] + arr[right] == n){
                    return true;
                }
                else if(arr[left] + arr[right] < x){
                    left = (left-1)%n;
                }
                else{
                    right = (1-right+n) % n;
                }
            }
            return false;
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 15, 6, 8, 9, 10};
        System.out.println(find(arr, 16));
    }
}
