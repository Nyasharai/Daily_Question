//Longest Common Prefix
import java.util.*;
class prog75 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);
        char first[] = strs[0].toCharArray();
        char last[] = strs[strs.length-1].toCharArray();
        for(int i = 0; i < first.length;i++){
            if(first[i] != last[i]){
                break;
            }
            res.append(first[i]);
        }
        return res.toString();
    }
}
/*
given:[club,clap,clove]
solution:[clap,clove,club]
first = ['c','l','a','p']
last = ['c','l','u','b']
for i : 0 to 4
    if c != c l != l
    break;
  cl
*/