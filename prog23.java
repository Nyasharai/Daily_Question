import java.util.*;

public class prog23 {
    public static void changeArr(int arr[], int i, int val){
        if(i == 5){
            printArr(arr);
            return; 
        }

        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 2; //backtracking
    }

    public static void printArr(int arr[]){
        for(int i = 0; i < 5; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);

    }
}