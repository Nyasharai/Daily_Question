// kth element in an array
import java.util.*;
import java.util.Arrays;

class prog10 {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return(nums.length - k + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums, 4));
    }
}
