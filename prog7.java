//Next Permutation
import java.util.*;
import java.util.Arrays;

public class prog7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ind = -1;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                ind = i - 1;
                break;
            }
        }
        if (ind != -1) {
            int temp = arr[ind];
            arr[ind] = arr[ind + 1];
            arr[ind + 1] = temp;

            int start = ind + 1;
            int end = n - 1;
            while (start < end) {
                int t = arr[start];
                arr[start] = arr[end];
                arr[end] = t;
                start++;
                end--;
            }
        } else {
            Arrays.sort(arr);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
