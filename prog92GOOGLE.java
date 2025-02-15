import java.util.*;
public class prog92GOOGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // no of words in dictionary
        int M = sc.nextInt(); // length of each word
        sc.nextLine();

        String dictionary[] = new String[N];

        for(int i = 0; i < N; i++){
            dictionary[i] = sc.nextLine();
        }
        int Q = sc.nextInt(); // no of query word
        sc.nextLine();
        int counts[] = new int[4];
        for(int i = 0; i < Q; i++){
            String query = sc.nextLine();
            counts[i] = match_count(dictionary, query);
        }
        for(int i = 0 ; i < Q; i++){
            System.out.println(counts[i]);
        }
    }

    public static int match_count(String dictionary[], String query){
        int count = 0;
        for(int i = 0; i < dictionary.length; i++){
            String word = dictionary[i];
            if(isMatch(word,query)){
                count++; // 1 2
            }
        }
        return count;
    }
    public static boolean isMatch(String word, String query){
        for(int i = 0; i < word.length(); i++){
            if(query.charAt(i) != '?' && query.charAt(i) != word.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
