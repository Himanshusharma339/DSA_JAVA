import java.util.*;
public class FreindPairing {
    public static int freindpair(int n){
        //Base
        if(n == 1 || n == 2){
            return n;
        }
        //single
        // int fnm1 = freindpair(n-1);

        // //pair
        // int fnm2 = freindpair(n-2);

        // int pairWays = (n-1) * fnm2;
        // int totalways = fnm1 + pairWays;

        // return totalways;
        return freindpair(n-1) + (n-1)*freindpair(n-2);
    }
    public static void main(String[] args) {
    System.out.println(    freindpair(3));
        
    }
    
}
