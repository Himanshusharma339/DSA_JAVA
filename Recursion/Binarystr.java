import java.util.*;

public class Binarystr {

    public static void PrintBinarystr(int n,int lastplace,String str){
        //Base case
        if(n == 0){
            System.out.println(str);
            return;
        }
            //sit on 0 place
            PrintBinarystr(n-1,0, str+"0");
            if(lastplace == 0){
                PrintBinarystr(n-1,1,str+("1"));
            }

            
        
    }
    public static void main(String args[]){
        PrintBinarystr(3,0," ");

        

    }

    
}