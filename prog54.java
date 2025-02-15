import java.util.*;
public class prog54 {
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
    public static void printpath(ArrayList<Integer> path){
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i)+ "->");
        }
        System.out.println("null");
    }
    public static void path(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printpath(path);
        }
        path(root.left,path);
        path(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0; i < val.length; i++){
            root = insert(root, val[i]);
        }
        inorder(root);
        System.out.println();
        path(root, new ArrayList<>());
    }
}
