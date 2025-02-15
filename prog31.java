// Linked list TRAINING
// insertion
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class prog31 {
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
            tail.next = newNode;
            tail = tail.next;
            }
            data = sc.nextInt();
        }
        System.out.println("STOP");
        System.out.println("enter value to be inserted");
        data =sc.nextInt();
        head = insertBetween(head,data);
        System.out.println("updated linked list");
        printLinkedList(head);
    }
    public static void printLinkedList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
    }
    public static Node insertBetween (Node head, int data){
        System.out.println("enter the position where you want to insert new node");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        if(pos == 0){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode; 
            return head;
        }
        Node current = head;
        for(int i = 0; i < pos - 1 && current != null; i++){
            current = current.next;
        }

        if(current != null){
            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;
        }
        else{
            Node newNode = new Node(data);
            current.next = newNode;
            newNode.next = null;
        }
        return head;
    }
}