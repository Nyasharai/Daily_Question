// sum from root to leave node
import java.util.*;

public class prog81 {
    static class Node {
        int data;
        Node left, right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int calSum(Node node, int val) {
        if (node == null) {
            return 0;
        }
        val = (val * 10) + node.data;
        if (node.left == null && node.right == null) {
            return val;
        }
        return calSum(node.left, val) + calSum(node.right, val);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node(6);
        root.left = new Node(3);
        root.right = new Node(5);
        root.right.right = new Node(4);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.left.right.right = new Node(4);
        root.left.right.left = new Node(7);
        
        System.out.print("Sum of all paths is " + calSum(root, 0));
    }
}
