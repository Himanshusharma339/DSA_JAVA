import java.util.*;
public class ValidParen {
    public static boolean isvalid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            // opening case
            if(ch == '(' || ch == '{' || ch =='[') {
                s.push(ch);
            }
            else {
                //closing
                if(s.isEmpty()){
                    return false;
                }
                if( (s.peek() == '{' && ch == '}')
                || (s.peek() == '(' && ch == ')') ||
                (s.peek() == '[' && ch == ']') )
    
                s.pop();

                else {
                    return false;
                }   
            }
        }
        if(s.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            
            //Closing
            if(ch == ')') {
                int count =0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                } 
                if(count < 1) {
                    return true;// duplicate
                }
                else {
                    s.pop(); // opening pair
                }
            }
            else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }
public static void maxArea(int arr[]) {
int maxArea =0;
int nsr[] = new int[arr.length];
int nsl[] = new int[arr.length];
//Next smaller Right o(n)
Stack<Integer> s = new Stack<>();

for(int i= arr.length-1;i>=0;i--) {
    while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
        s.pop();
    }
    if(s.isEmpty()) {
        //-1
        nsr[i] = arr.length;
    }
    else {
        //top
        nsr[i] = s.peek();
    }
    s.push(i);
}
//Next smaller Left
s=new Stack<>(); /// khali stack
for(int i=0; i< arr.length;i++) {
    while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
        s.pop();
    }
    if(s.isEmpty()) {
        //-1
        nsl[i] = -1;
    }
    else {
        //top
        nsl[i] = s.peek();
    }
    s.push(i);
}
// Current Area :- width = j-i-1 = nsr[i] - nsl[i]-1 tc - o(n)

for(int i=0;i<arr.length;i++) {
    int height = arr[i];
    int width = nsr[i] - nsl[i] -1;
    int currArea = height *width;
    maxArea = Math.max(currArea, maxArea);
}

System.out.println("max area in histogram = "+ maxArea);

}
    public static void main(String[] args) {
        // String str = "()({})[]";
        // System.out.println(isvalid(str));
        // String str = "((a+b))";//true
        // String str2 = "((a-b))";//false
        // System.out.println(isDuplicate(str));
        // accordiing to ques our parenthesis is valid

        int arr[] = {2,1,5,6,2,3}; // heights in histogram-o(n)
        maxArea(arr);
        //  T/c is  o(n)

    }
    
}
