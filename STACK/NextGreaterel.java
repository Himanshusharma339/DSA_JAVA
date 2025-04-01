import java.util.*;
public class NextGreaterel {
    public static void main(String[] args) {
        int arr[] ={6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int NextGreater[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--) {
            //1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            //2 if-else
            if(s.isEmpty()) {
                NextGreater[i] = -1;
            } else {
                NextGreater[i] = arr[s.peek()];
            }
            //3 push in s
            s.push(i);
        }

        for(int i=0;i<NextGreater.length;i++) {
            System.out.print(NextGreater[i]+ " ");
        }
        System.out.println();
    }
    
}

//next Greater Right
//Next Greater Left
//Next Greater Right
//Next Greater Left
