//Contains Duplicate
import java.util.Arrays;
import java.util.*;

public class prog4 {
    public static boolean contain_duplicate(int nums[]){
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,1};
        System.out.print(contain_duplicate(nums));
    }
}
