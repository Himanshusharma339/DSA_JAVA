import java.util.*;
public class Sortedarr {

public static boolean Sorted(int arr[],int i){
if(i == arr.length-1){
    return true;
}
if(arr[i] > arr[i+1]){
  return false;
}
return Sorted(arr, i+1);
//O(N) bigo(on ->space a)
}

public static int firstOccurence(int arr[],int key ,int i){
    if(i ==arr.length){
        return -1;
    }
    if(arr[i] == key)
    {
        return i;
    }
    return firstOccurence(arr, key, i+1);
}

public static int lastOccurence(int arr[],int key ,int i){
    if(i == arr.length) {
        return -1;
    }
    int isFound = lastOccurence(arr, key, i+1);
   if(isFound != -1 && arr[i] == key){
    return i;
   }
   return isFound;
}

public static int Power(int x,int n){
    //base case
    if(n == 0){
        return 1;
    }
    // int xnm1= Power(x, n-1);
    // int xn = x *xnm1;
    // return xn;
    return x * Power(x, n-1);
}






    public static void main(String[] args) {
        // int arr[] = {4,4,4,4,4,6,6};
// System.out.println(lastOccurence(arr, 6, 5));
System.out.println(Power(2, 10));
// tc -> 0(n)

        
    }
    
}

