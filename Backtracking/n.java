import java.util.*;
public class n {

    public static boolean isSafe(char board[][],int row,int col){
        //verticle up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diag
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right diag
        for(int i=row-1,j=col+1;i>=0 &&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    public static boolean nQueen(char board[][],int row){
       if(row == board.length){
        // printBoard(board);
        count ++;
        return true;
       }
    

    //column loop
    for(int j=0;j<board.length;j++){
        if(isSafe(board,row,j)){
            board[row][j] ='Q';
            if(nQueen(board, row+1)){
                return true;
            }
            board[row][j]='X';//backtracking

        }
    }
    return false;
}

    public static void printBoard(char board [][]){
        System.out.println("--------chess--------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
        
        System.out.println();
        }
    }

    static int count =0;


    public static void main(String[] args) {
        int n=2;
        char board[][]= new char[n][n];
        //Initializing
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        if(nQueen(board, 0)){
            System.out.println("solution is possible");
            printBoard(board);
        }
        else {
            System.out.println("solution is not possible");
        }
        System.out.println("total ways to solve n queens = "+ count);
        
    }
    ism hmne 3 ways dekhe h aur jisme pure sol and 1me count aur 1 me kitne ways ho sakte h sol ke 
    
}
