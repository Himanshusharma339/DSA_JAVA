import java.util.*;

public class Operation {
    public static int getIthit(int n,int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else {
            return 1;
        }

    }
    public static void main(String[] args) {
   System.out.println(getIthit(10, 2));
        // 1010 so the 2nd place is 0
        
    }
    
}
