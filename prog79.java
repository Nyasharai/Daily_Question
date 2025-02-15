import java.util.HashMap;

public class prog79 {
    public static void main(String[] args) {
        String S = "geeksforgeeks";
        findDuplicates(S);
    }

    public static void findDuplicates(String S) {
        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Populate the HashMap with character counts
        for (char c : S.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print characters with a count greater than 1
        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ", count = " + entry.getValue());
            }
        }
    }
}
