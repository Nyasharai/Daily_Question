//1358. Number of Substrings Containing All Three Characters
import java.util.*;
public class prog85 {
    public static int substringThreeCharacter(String str){
        int start = 0;
        int end = 0; 
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(end < str.length()){
            map.put(str.charAt(end), map.getOrDefault(str.charAt(end),0)+1);
            while(map.getOrDefault('a', 0) >= 1 && map.getOrDefault('b', 0) >= 1 && map.getOrDefault('c', 0) >= 1){
                count = count + str.length() - end;
                map.put(str.charAt(start), map.get(str.charAt(start))-1);
                start++;
            }
            end++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "abcabc";
        System.out.print(substringThreeCharacter(str));
    }
}
