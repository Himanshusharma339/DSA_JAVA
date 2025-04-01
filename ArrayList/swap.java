
import java.util.*;
// import java.util.Collections;
public class swap {
    public static void Swep(ArrayList<Integer>list,int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);
    }
public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(2);
    // list.add(5);
    // list.add(9);
    // list.add(1);

    // int idx1 = 1,idx2 = 2;
    // System.out.println(list);
    // //  Swep(list,idx1 ,idx2);
    // System.out.println(list);

    // Collections.sort(list);//assending order
    // System.out.println(list);

    // //decending order
    // Collections.sort(list ,Collections.reverseOrder());
    // System.out.println(list);
    // // Comparator fx-logic
    ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1); list.add(2);
    mainList.add(list);

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(3); list2.add(4);

    mainList.add(list2);

for(int i=0; i<mainList.size(); i++) {
    ArrayList<Integer> currList = mainList.get(i);
    for(int j=0; j<currList.size(); j++) {
        System.out.print(currList.get(j)+ " ");

    }
    System.out.println();
}  
System.out.println(mainList); 
}
    
}
