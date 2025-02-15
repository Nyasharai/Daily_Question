import java.util.*;

public class prog52 {
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
    public static Node delete(Node root, int v){
        if(root.data < v){
            root.right = delete(root.right, v);
        }
        else if(root.data > v){
            root.left = delete(root.left, v);
        }
        else{
            //case 1 leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
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

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int value[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0; i < value.length; i++){
            root = insert(root,value[i]);
        }
        inorder(root);
        System.out.println();
        root = delete(root, 1);
        inorder(root);
    }
}