import java.util.*;

public class prog24 {
    public static void findSubset(String str, String ans,int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
            System.out.println(ans);
            }
            return;
        }
        //recursion
        //yes
        findSubset(str, ans+str.charAt(i), i+1);
        //no
        findSubset(str, ans, i+1);
    }

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = "abc";
        findSubset(s, "",0);
    }
}