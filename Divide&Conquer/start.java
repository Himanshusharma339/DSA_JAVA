import java.util.*;

public class start {
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " "); 
               }
               System.out.println();
    }

    public static void MergeSort(int arr[],int si,int ei){
        //base
        if(si >= ei){
            return;
        }
        //kaam

        int mid = si +(ei - si)/2;
        MergeSort(arr, si, mid);//left part
        MergeSort(arr, mid+1, ei);//right part
        merge(arr, si,mid, ei);


    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]= new int[ei-si+1];//total k lye
        int i = si; //iterator for left part
        int j = mid + 1;//iterator for right part
        int k=0; // iterator for temp arr

        while (i <= mid && j<= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        //copy temp to origional arr

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-2};
        MergeSort(arr, 0, arr.length-1);
        PrintArr(arr);
        
    }//T_C is O(nlogn),space comp - o(n) its also called DFS
    
}
