import java.util.*;
public class prog91 {
    public static int longestSubstring(String s){
        int n = s.length();
        int i = 0;
        int j = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(j < n){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),j);
                max = Math.max(max, j-i+1);
                j++;
            }
            else{
                map.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String testStr = "abcabcdbb";
        System.out.println("The length of the longest substring without repeating characters is: " + longestSubstring(testStr));
    }
}
