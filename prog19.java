// Largest Number formed from an Array
import java.util.*;
import java.util.Arrays;

public class prog19 {
    public static String largestNum(int arr[]){
        int n = arr.length;
        String s[] = new String[n];
        for(int i = 0; i < n; i++){
            s[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(s, (a,b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        for(String str: s){
            sb.append(str);
        }
        String result = sb.toString();
        return result.startsWith("0") ? "0" : result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,34,3,98,9,76,45,4};
        System.out.println(largestNum(arr));
    }
}