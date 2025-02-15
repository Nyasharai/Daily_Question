// palindrome linked list
// here in this you can do - stack or using fast and slow pointer
// down is diff question - oddevenlinkedlist
// take position , values as odd even & merge it
import java.util.*;
public class prog80 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node calc(Node head){ // 1 2 3 4 5 -> 1 3 5 2 4
        if(head == null || head.next == null){
            return head;
        }
        Node odd = head;
        Node even = head.next;
        Node evenNode = even;
        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenNode; // 
        // even.next = null;
        return head;
    }
    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node(1);
        newNode.next = new Node(2);
        newNode.next.next = new Node(3);
        Node curr = calc(newNode);
        print(curr);
    }
}

