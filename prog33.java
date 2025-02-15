
// merge k linked list into one linked List in ascending order
import java.util.*;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class prog33 {

  public static Node mergeKLists(Node[] lists) {
    if (lists == null || lists.length == 0)
      return null;

    return merge(lists, 0, lists.length - 1); // Recursive merge function
  }

  private static Node merge(Node[] lists, int start, int end) {
    if (start == end) {
      return lists[start]; // Base case: single list
    }

    int mid = start + (end - start) / 2;
    Node left = merge(lists, start, mid); // Merge left half
    Node right = merge(lists, mid + 1, end); // Merge right half

    return mergeTwoLists(left, right); // Merge the two sorted halves
  }

  private static Node mergeTwoLists(Node left, Node right) {
    if (left == null)
      return right;
    if (right == null)
      return left;

    Node head = null;
    Node tail = null;

    while (left != null && right != null) {
      if (left.data <= right.data) {
        if (head == null) {
          head = tail = left;
        } else {
          tail.next = left;
          tail = tail.next;
        }
        left = left.next;
      } else {
        if (head == null) {
          head = tail = right;
        } else {
          tail.next = right;
          tail = tail.next;
        }
        right = right.next;
      }
    }

    // Attach remaining elements from either list
    tail.next = left != null ? left : right;

    return head;
  }

  public static void printList(Node head) {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println("NULL");
  }

  public static void main(String[] args) {
    // Sample linked lists (replace with your data)
    Node list1 = new Node(1);
    list1.next = new Node(4);
    list1.next.next = new Node(5);
    printList(list1);

    Node list2 = new Node(2);
    list2.next = new Node(3);
    printList(list2);

    Node list3 = new Node(7);
    printList(list3);

    Node[] lists = new Node[] { list1, list2, list3 };

    Node mergedHead = mergeKLists(lists);
    System.out.println("Merged list:");
    printList(mergedHead);
  }
}
