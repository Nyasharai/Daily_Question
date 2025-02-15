// Linked list TRAINING
// simple program
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class prog30 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;
        int data = sc.nextInt();
        while(data != -1){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
            tail.next = newNode;// head.next = newNode;
            tail = tail.next;
            }
            data = sc.nextInt();
        }
        System.out.println("STOP");
        System.out.println("Now print linked list");
        printLinkedList(head);
    }
    public static void printLinkedList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
    }
}