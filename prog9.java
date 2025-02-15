//Repeat and Missing Number Array
import java.util.*;

public class prog9 {
    public static void repeatedNum(int arr[]){
        int count = 0;
        int repeat = 0;
        int missing = 0;
        boolean present[] = {false};
        for(int i = 0; i < arr.length; i++){
            if(present[arr[i]] == true){
                repeat = arr[i];
            }
            present[arr[i]] = true;
        }

        for(int i = 1; i <=arr.length; i++){
            if(present[i] == false){
                missing = i;
                break;
            }
        }
        System.out.println(repeat);
        System.out.println(missing);   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3, 1, 2, 5, 3};
        repeatedNum(arr);
        // System.out.println();
    }
}
