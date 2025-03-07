import java.util.*;

public class EvenOdd {
    public static void EverOrOdd(int n){
        int bitMas = 1;
        if((n & bitMas)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        EverOrOdd(12);
        EverOrOdd(13);
        
    }
    
}
