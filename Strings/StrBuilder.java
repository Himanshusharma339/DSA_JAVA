import java.util.*;
 class StrBuilder {
      //String Builer sb = String Builder("Hw")
        //sb.toString()-> ye kisi bhi string ko obj me convet karta hai]

    public static void main(String[] args) {
      
        StringBuilder Sb = new StringBuilder(" ");
        for(char ch='a';ch<='z';ch++){
            Sb.append(ch);
        
        }
        System.out.println(Sb.length());
//tc ->o(26)

    }
    
}
