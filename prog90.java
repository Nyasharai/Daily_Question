import java.util.*;

public class prog90 {
    public static void findDuplicate(String s){
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + ", count = " + entry.getValue());
            }
        }
    }
    
    public static void main(String[] args) {
        String s = "test string";
        findDuplicate(s);
    }
}
