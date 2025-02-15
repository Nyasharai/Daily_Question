// Merge two linked list list1 & list2
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class prog32 {
    public static Node createLinkedList(int values[]){
        Arrays.sort(values);
        if(values.length == 0){
            return null;
        }
        Node head = new Node(values[0]);
        Node current = head;
        for(int i = 1; i < values.length; i++){
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }

    public static Node mergedLinkedList(Node list1, Node list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        // list1 - 1 4 2 list2 - 3 0 5
        if(list1.data < list2.data){
            list1.next = mergedLinkedList(list1.next, list2);
            return list1;
        }
        else{
            list2.next = mergedLinkedList(list1, list2.next);
            return list2;
        }
    }

    public static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of list1");
        int size1 = sc.nextInt();
        int list1[] = new int[size1];
        System.out.println("Enter element in list1");
        for(int i = 0; i < size1; i++){
            list1[i] = sc.nextInt();
        }

        System.out.println("Enter size of list2");
        int size2 = sc.nextInt();
        int list2[] = new int[size2];
        System.out.println("Enter element in list1");
        for(int i = 0; i < size2; i++){
            list2[i] = sc.nextInt();
        }

        Node head1 = createLinkedList(list1);
        Node head2 = createLinkedList(list2);

        Node mergedHead = mergedLinkedList(head1,head2);
        printList(mergedHead);
    }
}
