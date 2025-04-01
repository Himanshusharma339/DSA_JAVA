// import java.util.*;
// public class QueueB {

   


//     public static void main(String[] args) {
//         // Queue q = new Queue();
//         // Queue<Integer>q = new LinkedList<>();//ArrayDeque
//         Queue<Integer> q = new ArrayDeque<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();

//         }// Queue ek interface h=interface ka obj nhi bnatae

        
//     }
// }

import java.util.*;// in JCF all time complexity is 0(1) .
import java.util.Queue;

public class QueueB {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>(); // LinkedList implementation
        Queue<Integer> q = new ArrayDeque<>();  // ArrayDeque implementation
        
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek()); // Front element
            q.remove(); // Remove front element
        }
    }
}
