import java.util.*;
public class prog88 {
    public static String find(String s){
        if(s.length() == 1){
            return s;
        }
        String p = ""; int i = 0;
        for(i = 1; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                p = p + s.charAt(i-1);
            }
        }
        if(i == s.length()){
            p = p + s.charAt(i-1);
        }
        return p;
    }
    public static void main(String[] args) {
        String s = "aabaa";
        System.out.print(find(s));
    }
}
