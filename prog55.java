import java.util.*;
public class prog55 {
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
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node leftsub = mirror(root.left);
        Node righsub = mirror(root.right);
        root.left = righsub;
        root.right = leftsub;
        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        preorder(root);
        System.out.println();
        mirror(root); 
        preorder(root);
    }
}
