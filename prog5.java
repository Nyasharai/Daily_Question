// Chocolate Distribution Problem O(nlogn)
import java.util.*;
import java.util.Arrays;

public class prog5 {
    public static int chocolateProblem(int arr[], int k){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i+k-1 < arr.length; i++){
            int diff = arr[i+k-1] - arr[i];
            if(diff < min){
                min = diff;
            }
        }
        return min;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the number of students: ");
        int m = sc.nextInt();
        System.out.println("Enter element: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(chocolateProblem(arr, m));
    }
}
