import java.util.*;

public class SetIthBit {
    public static int SetIbit(int n ,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int UpdateIthit(int n,int i, int newBit){
        // if(newBit ==0){
        //     return clearIthit(n, i);
        // }
        // else{
        //     return SetIthBit(n,i);
        // }

        n = clearIthit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int ClearLastibits(int n,int i){
       int BitMask = (~0)<<i;
       return n & BitMask;

    }
public static int Clearbitrange(int n,int i,int j) {
    int a = (~0)<<(j+1);
    int b = (1<< i) -1;
    int bitMask = a|b;
    return n & bitMask;
}

public static boolean isPowerOfTwo(int n) {
    return (n&(n-1)) == 0;
    // CHECK IS A NO.POWER OF 2 OR NOT 

}

//COUNT SET bITS IN  a number
public static int countSetBits(int n){
    int count =0;
    while(n>0) {
        if((n & 1) != 0) { //check our LSB
            count++;
        }
       n= n>>1;
    }
    return count;
}

//Fast Exponentiation
public static int FastExpo(int a , int n){
    int ans = 1;
    while (n>0){
        if((n & 1) != 0){
            ans = ans *a;
        }
        a=a*a;
        n=n>>1;
    }

    return ans;
}

    public static void main(String[] args) {
        
        System.out.println(FastExpo(3,4));
    }


    
    
}
