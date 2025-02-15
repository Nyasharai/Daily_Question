import java.util.*;
public class prog56 {
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
    public static Node insert(Node root, int v){
        if(root == null){
            root = new Node(v);
            return root;
        }
        if(root.data > v){
            root.left = insert(root.left,v);
        }
        else{
            root.right = insert(root.right, v);
        }
        return root;
    }
    public static boolean valid(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        if(max != null && root.data >= max.data){
            return false;
        }
        return valid(root.left, min, root) && valid(root.right, root, max);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int value[] = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i = 0; i < 7; i++){
            root = insert(root, value[i]);
        }
        System.out.print(valid(root, null, null));
    }
}