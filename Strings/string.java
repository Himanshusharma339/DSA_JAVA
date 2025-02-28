import java.util.*;

public class string {
    public static void PrintLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

    //     char arr[]={'a','b','c','d'};
    //     String str = "abcd";
    //     String str2 = new String("xyz");
    
    // //Strings are Immutable
    // Scanner sc = new Scanner(System.in);
    // String name;
    // name =sc.nextLine();
    // System.out.println(name);

    // String fullName = "Tony stark";
    // System.out.println(fullName.length());//len is func in arr is prop

    //concatination
    String f1="HIMANSHU";
    String f2 = "SHARMA";

    String fullName = f1 + " "+ f2;
    // System.out.print(fullName.charAt(0));

    //.CharAt
    PrintLetters(fullName);
    


    
}
}
