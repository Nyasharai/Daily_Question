//Reverse the Array

import java.util.*;
public class prog2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int reverse_arr[] = new int[n];
        System.out.println("Enter element: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            reverse_arr[i] = 0;
        }

        int p = 0;
        for(int i = n-1; i >= 0; i--){
            reverse_arr[p] = arr[i];
            p++;
        }

        for(int i = 0; i < n; i++){
            System.out.print(reverse_arr[i]+" ");
        }
    }
}
