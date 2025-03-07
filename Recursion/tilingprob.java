import java.util.*;
public class tilingprob {
    public static int tilingProblem(int n){
        // base

        if(n == 0 || n == 1){
            return 1;
        }
        // kaam
        // choice 
        //vertical
        int fnm1 =tilingProblem(n-1);
        
        //Horizontal
        int fnm2 = tilingProblem(n-2);

        int totalways = fnm1 + fnm2;
        return totalways;


    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
        
    }

    
}