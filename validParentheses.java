// string has just '(' and ')' find the length of the longest valid parentheses substring
import java.util.*;

public class validParentheses {
    public static int maintainStack(String s) {
        Stack<Integer> stack = new Stack<>();
        int maxLength = 0;
        int base = -1; // Base index to handle unmatched closing parentheses

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else { // When encountering a closing parenthesis
                if (!stack.isEmpty()) { // If there's a corresponding opening parenthesis
                    stack.pop();
                    if (stack.isEmpty()) {
                        maxLength = Math.max(maxLength, i - base);
                    } else {
                        maxLength = Math.max(maxLength, i - stack.peek());
                    }
                } else { // If there's no corresponding opening parenthesis
                    base = i; // Update the base index
                }
            }
        }

        return maxLength;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of parentheses:");
        String s = sc.next();
        int length = maintainStack(s);
        System.out.println(length);
        sc.close();
    }
}
