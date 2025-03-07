import java.util.*;
public class StringBuil {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.insert(2,"mo" );
        sb.deleteCharAt(0);
        sb.replace(4,5 , "o");
        
        System.out.println(sb);

    }
    
}
