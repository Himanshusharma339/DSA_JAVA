importjava.util.*;
public class INTERFACE {

    public static void main(String[] args) {
        
    }

interface chessPlayer{
    void moves();
}
class Queen implements chessPlayer{
    void moves(){
        System.out.println("up,left,right,bottom,diagonal");
    }
}

class Rook implements chessPlayer{
    void moves(){
        System.out.println("up,left,right,down");
    }
}
}