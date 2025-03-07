import java.util.*;



public class Start {
    // public static void PrintDec(int n){
    //    if(n == 1){
    //     System.out.println(n);
    //     return;
    //    }
    //    System.out.println(n +" ");
    //    PrintDec(n-1);
    // }
// public static void PrintIncr(int n){
//     //Base Case 
//     if(n == 1){
//         System.out.println(1);
//         return;
//     }
//     PrintIncr(n-1);
// System.out.println(n);
// }

// public static int PrintFact(int n){
//     if(n == 0){
//         return 1;
//     }
// int fnm1=PrintFact(n-1);
// int fn = n * PrintFact(n-1);
// return fn;

// }
// //T/C is O(N)
// // call stack ke karan O(N) space complexity


public static int PrintNatural(int n)
{
    if(n==1)
    {
        return 1;
    }

    int sm1=PrintNatural(n-1);
    int sm = n + sm1;
    return sm;


}
    public static void main(String[] args) {
        int n=5;
        // PrintDec(n);
        // PrintIncr(n);
//   System.out.println(PrintFact(5));
System.out.println(PrintNatural(5));
//    T/c  and S/c -> O(n)
       
    }

   

    
}

