// tree
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class binaryTree {
    Node root;
    binaryTree(){
        root = null;
    }

    void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.data+ " ");

        System.out.println(node.left);

        System.out.println(node.right);
    }

    void preOrderTraversal(){
        preOrder(root);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        binaryTree tree = new binaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left= new Node(10);
        tree.root.left.right.right = new Node(11);
        System.out.println("Preorder traversal of binary tree is:");
        tree.preOrderTraversal();
    }
}