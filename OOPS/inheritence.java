import java.util.*;
public class inheritence {
    class papa{
        String nature;
        void quality(String goods){
            goods = nature;
        }
    }

    class Son extends papa{
        String pp(){
            System.out.println(goods + "hari");
        }

    }
    public static void main(String[] args) {
        
        papa obj = new papa();
        obj.nature();
        System.out.println(obj.nature);
    }
    
}
