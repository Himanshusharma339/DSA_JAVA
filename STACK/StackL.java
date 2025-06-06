// import java.util.ArrayList;
import java.util.*;// for java collection framework

public class StackL {
    static class Node {
        int data;
        Node next;
        Node(int data) {//constructor
            this.data = data;
            this.next = null;
        }

    }
    static class Stack {
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }
        //push
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
            return;
        }
        //pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            return top;
        }
        //peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }

    
}