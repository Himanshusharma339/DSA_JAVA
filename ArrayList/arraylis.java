import java.util.*;

public class arraylis {
    public static void main(String[] args) {
        // className obj = new className();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);
        System.out.println(list);

        //get operation
       int elem= list.get(1);
        System.out.println(elem);
        int rem = list.remove(1);
        System.out.println(rem);

    }

    
}