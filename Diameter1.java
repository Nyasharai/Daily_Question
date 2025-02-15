//diameter of tree

import java.util.*;
public class Diameter1{
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
    public static int height(Node root){
        if(root ==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }
    public static int diam(Node root){
        if(root == null){
            return 0;
        }
        int ldiam = diam(root.left);
        int rdiam = diam(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh+rh+1,Math.max(ldiam, rdiam));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(diam(root));
    }
}

