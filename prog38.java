import java.util.*;

public class prog38 {
    public static boolean isPalindrome(String s){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder rev = new StringBuilder(str).reverse();
        return str.toString().equals(rev.toString());
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean t = isPalindrome("race a car");
        if(t){
            System.out.println(t);
        }
        else{
            System.out.println(t);
        }
    }
}