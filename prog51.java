import java.util.*;

public class prog51 {
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
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static boolean search(Node root, int k){
        if(root == null){
            return false;
        }

        if(root.data == k){
            return true;
        }
        if(root.data > k){
            return search(root.left,k);
        }
        else{
            return search(root.right, k);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int value[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0; i < 6; i++){
            root = insert(root, value[i]);
        }
        inorder(root);
        System.out.print(search(root, 6));
    }
}
