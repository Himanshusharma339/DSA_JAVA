import java.util.*;
import java.util.Queue;

public class Q3 {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty();
        }

        public static void push(int data) {
            q1.add(data); // हमेशा q1 में add करेंगे
        }

        // Pop function
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }

            // q1 के सारे elements को q2 में डालो, बस **last को छोड़कर**
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            // q1 का last element ही हमारा top होगा, उसे return कर देंगे
            int top = q1.remove();

            // **अब q1 और q2 को swap करना बहुत जरूरी है**
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }

        // Peek function (top element return करेगा)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }

            // q1 के सारे elements को q2 में डालो, बस **last को छोड़कर**
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            // q1 का last element ही हमारा top होगा
            int top = q1.peek();
            q2.add(q1.remove()); // इसे भी q2 में डाल दो

            // **अब q1 और q2 को swap करना बहुत जरूरी है**
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek()); // Peek करके top print कर देंगे
            s.pop(); // फिर pop कर देंगे
        }
    }
}
