import java.util.*;
public class OptimizedPower {
    public static int OptimizedP(int a,int n){//abhi time c h 0(n) is 0(logn)
        if(n == 0){
            return 1;
        }
        int halfpower =  OptimizedP(a,n/2);


        int halfPSq = halfpower * halfpower;
        //for odd
        if(n%2 != 0){
            halfPSq = a * halfPSq;
        }
        return halfPSq;

    }

    public static void main(String[] args) {
        System.out.println(OptimizedP(2, 4));
        
    }
    
}
