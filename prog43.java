import java.util.*;

public class prog43 {
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

    public static boolean getpath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundLeft = getpath(root.left, n, path);
        boolean foundRight = getpath(root.right, n, path);
        if(foundLeft||foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node traversal(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root, n1, path1);
        getpath(root,n2,path2);

        int i = 0; 
        for(; i < path1.size() && i < path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        //last common ancestor
        Node lca = path1.get(i-1);
        return lca;
    }

    public static Node lca2(Node root, int n1, int n2){
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLca = lca2(root.left, n1,n2);
        Node rightLca = lca2(root.right, n1, n2);

        //leftLca = va; rightLca = null
        if(rightLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }
        return root;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4;
        int n2 = 6;
        System.out.print(lca2(root, n1, n2).data);
    }
}