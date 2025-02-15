// Search in Rotated Sorted Array
import java.util.*;

public class prog6 {
    public static int rotatedArray(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(key == arr[i]){
            return i;
        }
       
    }
    return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the target to search: ");
        int m = sc.nextInt();
        System.out.println("Enter element: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(rotatedArray(arr, m));
    }
}
