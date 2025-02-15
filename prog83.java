import java.util.*;
public class prog83 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isValid(Node root){
        return check(Integer.MIN_VALUE,Integer.MAX_VALUE,root);
    }
    public static boolean check(int min, int max, Node root){
        if(root == null){
            return true;
        }
        if(root.data >= max || root.data <= min){
            return false;
        }
        return check(min,root.data,root.left) && check(root.data,max,root.right);
    }
    public static void main(String[] args) {
        Node node = new Node(1);
    }
}
