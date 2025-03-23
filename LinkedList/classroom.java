import java.util.*;

public class classroom {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Methods in class
    //add
    
    public void addFirst(int data) {

        //step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step2 = newNode next = head
        newNode.next = head;//linking step 

        //step3 - head = newNode
        head = newNode;
    }


    public  void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;
    }
    public  void print() {
        //base case
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //add node tc- o(n)
    public void add(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;

        int i=0;
        while(i< idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx-1;temp-> prev;
        newNode.next = temp.next;
        temp.next = newNode;
    }
    //Remove first
    public int removeFirst() {
        //base case
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } 
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;

    }
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head =  tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;//tail .data = vo data jisko mujhe delete karna h
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    // Iterative search
public int itrSearch(int key) {//o(n) in linear
    Node temp = head;
    int i=0;

    while(temp != null) {
        if(temp.data == key) {
            return i;
        }
        temp = temp.next;
        i++;
    }

    //key not found case
    return -1;
}
// Recursive case
public int helper(Node head,int key) { // o(n) tc in linear and sc also o(n) becxause call stack is working 
    if(head == null){
        return -1;
    }

    if(head.data == key){
        return 0;
    }

    int idx = helper(head.next, key);
    if(idx == -1) {
        return -1;  
    }
    return idx + 1;

}
public int recSearch(int key) {
    return helper(head,key);
}

public void reverse() {//Tc is O(n) in reverse
    Node prev = null;
    Node curr = tail= head; // here in ll java assignment is right to left
    Node next;

    while(curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next; 

    }
    head = prev;
}

public void deleteNthFromEnd(int n) {
    //calculate size
    int sz = 0;
    Node temp = head;
    while( temp != null){
        temp = temp.next;
        sz++;
    }
    if(n == sz){
        head = head.next;//remove first
        return;

    }
    //sz-n ye jo node delete karni h usese pehle ki node ke liye find kiya h
    int i=1;
    int iToFind = sz-n;
    Node prev = head;
    while(i < iToFind) {
        prev = prev.next;
        i++;
    }
    prev.next = prev.next.next;
    return;
}

//find middle using #####Slow fast approach
public Node FindMid(Node head){ //helper function
    Node slow = head;//+1
    Node fast = head;//+2

    while (fast != null && fast.next != null) {
        slow= slow.next;
        fast = fast.next.next;
    }
    return slow; // return middle val

}

public boolean checkPalindrome() {
    if(head == null || head.next == null) {
        return true;
    }
    //step 1 -find mid
    Node midNode = FindMid(head);

    //step 2 - reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;

    while(curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;

    }
    Node right = prev;//left half head
    Node left = head;//right half 

    // step 3- check left half & right half
    while(right != null) {
        if(left.data != right.data) {
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
}
// Is cycle 
public static boolean isCycle() {
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null) {
        slow = slow.next;//+1
        fast = fast.next.next;//+2
        if(slow == fast) {
            return true; // cycle exists
        }
    }

    return false; // cycle doesn't exist


}

    public static void main(String[] args) {
    classroom ll = new classroom();
    // ll.head = new Node(1);
    // ll.head.next = new Node(2);
  
   ll.addFirst(2);
   ll.addFirst(1);
   ll.addLast(2);
//    ll.addLast(5);

//    ll.add(2,3);
   //1->2->3->4->5
//    ll.print();
//    System.out.println(ll.size);
// ll.removeFirst();
// ll.print();

// ll.removeLast();
// ll.print();
// System.out.println(ll.size);
// ll.removeLast();
// ll.print();

// System.out.println(ll.recSearch(3));
// System.out.println(ll.recSearch(10));

// ll.print();
// ll.reverse();
// ll.print();
// ll.deleteNthFromEnd(3);
// FindMid();
// ll.print(); //1->2->2->1
// System.out.println(ll.checkPalindrome());

//is cycle
head = new Node(1);
head.next =  new Node(2);
head.next.next = new Node(3);
head.next.next.next = new Node(4);
// 1->2->3>1
System.out.println(isCycle());

    }
}

    
    

// Tc is O(n)