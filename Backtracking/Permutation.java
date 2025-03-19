import java.util.*;


public class Permutation {
    public static void findPermutation(String str,String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char current = str.charAt(i);

          String Newstr =  str.substring(0, i) + str.substring(i+1);
           findPermutation(Newstr, ans+current);
        }
        //T-c is o(n * n)!

    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str,"");
        
    }

    
}