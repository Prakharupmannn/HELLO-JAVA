import java.util.*;

class Node{
    String data;
    Node next;

    Node(String data){
        this.data = data;
        this.next = null;
    }
}
public class revll {
    Node head;
    public void add(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public void reverseIterate() {
        if(head == null || head.next == null) {
            return;
        }
        
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public void printlist() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static void main(String[] args) {
        revll list = new revll();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        System.out.println("original list : ");
        list.printlist();

        // list.reverseIterate();
        // System.out.println("Reversed list : ");
        // list.printlist();
        list.head = list.reverseRecursive(list.head);
        list.printlist();
    }
}
