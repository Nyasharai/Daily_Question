import java.util.*;

public class prog87 {
    public static boolean validPalindrome(String s){
        StringBuilder t = new StringBuilder();
        int n = s.length();
        for(int i = 0;i < n; i++){
            char ch1 = s.charAt(i);
            if(Character.isLetterOrDigit(ch1)){
                t.append(Character.toLowerCase(ch1));
            }
        }
        StringBuilder rev = new StringBuilder(t).reverse();
        return t.toString().equals(rev.toString());
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = "race a car";
        System.out.print(validPalindrome(s));
    }
}