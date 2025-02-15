import java.util.*;
public class prog53 {
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
            root.left = insert(root.left, v);
        }
        else{
            root.right = insert(root.right, v);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void printrange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >=k1 && root.data <= k2){
            printrange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printrange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printrange(root.left, k1, k2);
        }
        else{
            printrange(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        int value[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0;i < value.length;i++){
            root = insert(root, value[i]);
        }
        inorder(root);
        System.out.println();
        printrange(root, 5, 12);
    }
}
