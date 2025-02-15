import java.util.*;

public class prog22 {
    public static int[] optimizedBubblesort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            boolean swap = false;
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,2,4};
        int arr1[] = optimizedBubblesort(arr);
        System.out.println("optimized array:");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
}