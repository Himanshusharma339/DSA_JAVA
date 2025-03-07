import java.util.*;
public class RemoveDupli {
    public static void removeDuplicate(String str,int idx, StringBuilder newStr , boolean map[]){

        //Base
        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // Kaam

        char currchar = str.charAt(idx);

        if(map[currchar - 'a'] == true){
            //duplicate
            removeDuplicate(str, idx+1, newStr, map);
        }
        else{
            map[currchar - 'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String str = "aapannnnaaacooolege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        
    }
    
}
