//immersion
import java.util.*;
public class prog76 {
    public static int minChanges(String s) {
        int n = s.length();
        int[] countA = new int[n + 1];
        int[] countB = new int[n + 1];

        // countA[i] will be the number of 'A's in the substring s[0..i-1]
        // countB[i] will be the number of 'B's in the substring s[i..n-1]
        for (int i = 0; i < n; i++) {
            countA[i + 1] = countA[i] + (s.charAt(i) == 'A' ? 1 : 0);
        }
        for (int i = n - 1; i >= 0; i--) {
            countB[i] = countB[i + 1] + (s.charAt(i) == 'B' ? 1 : 0);
        }

        // Initialize the minimum changes to a large value
        int minChanges = Integer.MAX_VALUE;

        // Calculate the minimum changes required to split the string
        for (int i = 0; i <= n; i++) {
            int changes = (i - countA[i]) + (n - i - countB[i]);
            minChanges = Math.min(minChanges, changes);
        }

        return minChanges;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(minChanges("ABB")); // Output: 0
    }
}
