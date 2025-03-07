import java.util.*;

public class Fibonacci {
    public static int PrintFabonacci(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        

        
        int fibN1 = PrintFabonacci(n-1);
        int fibN2 = PrintFabonacci(n-2);

        int fibN = fibN1 + fibN2;
        return fibN;

    }
    public static void main(String[] args) {
   System.out.println(PrintFabonacci(6));
//    t/c->o(2^n) exponential  ye achi nhi h slow process hogi isko dp ki help se fast karenge
// sc -> o(n)
        
    }
    
}
