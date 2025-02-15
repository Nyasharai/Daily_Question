// palindrome linked list
// here in this you can do - stack or using fast and slow pointer
import java.util.*;
public class prog77 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean check(Node head){
        Node check = head;
        Stack<Integer> stack = new Stack<>();
        while(stack != null){
            stack.push(check.data);
            check = check.next;
        }
        while(head != null){
            Node newNode = stack.pop();
            if(newNode == head){
                check = true;
            }
            else{
                check = false;
            }
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node(1);
        newNode.next = new Node(2);
        newNode.next.next = new Node(1);
    }
}

