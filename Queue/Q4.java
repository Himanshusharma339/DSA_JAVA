import java.util.*;
import java.util.Queue;
public class Q4 {
    public static void NonRepeatingElement(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0;i<str.length();i++) {
          char  ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a']>1) {
                q.remove();
            }
            if(q.isEmpty()) {
                System.out.println(-1 + " ");
            }else {
                System.out.println(q.peek()+" ");
            }

        }
        System.out.println();


    }
    public static void main(String[] args) {
        String str = "aabccxb";
        NonRepeatingElement(str);
    }
    
}
