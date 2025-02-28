import java.util.*;

public class ShortestPath {
    public static float shortest(String path){
        int x=0,y=0;
        int N=y+1;
        int S = y-1;
        int E = x+1;
        int W = x-1;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //south
            if(dir =='S'){
                y--;
            }
            else if(dir == 'w'){
                x--;
            }
            else if(dir == 'E'){
                x++;

            }
            else {
                y++;
            }

        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String path = "NS";
        System.out.println(shortest(path));

        
    }
    
}//tc->O(n)
