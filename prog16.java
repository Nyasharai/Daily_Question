// 3Sum
import java.util.*;

public class prog16 {
    public static int maxArea(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int maxArea = 0;
        while(left < right){
            int area = Math.min(arr[left], arr[right])* (right-left);
            maxArea = Math.max(maxArea, area);

            if(arr[left] < arr[right]){
                left++;
            }
            else right--;
        }
        return maxArea;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
