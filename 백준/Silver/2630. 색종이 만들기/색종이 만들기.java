import java.util.*;

public class Main{
    public static int white=0;
    public static int blue=0;
    public static int[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        board=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=sc.nextInt();
            }
        }
        part(0,0,n);
        System.out.println(white);
        System.out.println(blue);
    }
    public static void part(int row, int col, int size){
        if(colorCheck(row, col, size)){
            if(board[row][col]==0){
                white++;
            } else {
                blue++;
            }
            return;
        }
        int newsize=size/2;
        part(row, col, newsize);
        part(row, col+newsize, newsize);
        part(row+newsize, col, newsize);
        part(row+newsize, col+newsize, newsize);
    }
    public static boolean colorCheck(int row, int col, int size){
        int color=board[row][col];
        for(int i=row; i<row+size; i++){
            for(int j=col;j<col+size;j++){
                if(board[i][j]!=color){
                    return false;
                }
            }
        }
        return true;
    }
}
