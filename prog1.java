// Maximum and Minimum Element in an Array

import java.util.*;
public class prog1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else{
                max = arr[i];
            }
        }
        System.out.println("Minimum element: "+min);
        System.out.println("Maximum element: "+max);
    }
}