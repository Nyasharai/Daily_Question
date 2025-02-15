import java.util.*;

public class prog27 {
    public static void findPermutation(String str, String ans){
        //base
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(newStr, ans+ch);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        findPermutation("abc", "");
    }
}