import java.util.*;
public class sumNum {
    public static void main(String[] args) {
        int [][] nums={{1,4,9},{11,4,3},{2,3,4}};
        int sum=0;

        //sum of second row elements

        for(int j=0;j<nums[0].length;j++){
            sum +=nums[1][j];
        }
        System.out.println("sum is"+sum);
        
    }
    
}
