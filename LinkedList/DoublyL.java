import java.util.*;
public class DoublyL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node (int data) { // constructor
            this.data= data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    //print
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //remove - removeLast
    public int removeFirst() {
        if(head == null ) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1) {
            int val = head.data;
            head.prev = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev= next;

            prev = curr;
            curr = next;

        }
        head = prev;
    }


    public static void main(String[] args) {
        DoublyL dll = new DoublyL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        dll.reverse();
        dll.print();
        // dll.print();
        // System.out.println(dll.size);

        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);
        
        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);


        
    }
    
}
