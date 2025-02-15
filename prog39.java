import java.util.*;

class prog39 {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char st[] = s.toCharArray();
        char at[] = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(at);
        return Arrays.equals(st,at);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean t = isAnagram("rat", "par");
        System.out.println(t);
    }
}
