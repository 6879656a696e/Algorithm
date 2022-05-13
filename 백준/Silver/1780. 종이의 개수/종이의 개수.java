import java.util.*;

public class Main{
    public static int[][] board;
    public static int gray=0;
    public static int white=0;
    public static int black=0;
    public static StringBuilder sb = new StringBuilder();
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
        System.out.println(gray);
        System.out.println(white);
        System.out.println(black);
    }
    public static void part(int row, int col, int size){
        if(colorCheck(row, col, size)){
            if(board[row][col]==-1){
                gray++;
            } else if(board[row][col]==0){
                white++;
            } else {
                black++;
            }
            return;
        }
        int newSize=size/3;
        part(row, col, newSize);
        part(row, col+newSize, newSize);
        part(row, col+2*newSize, newSize);

        part(row+newSize, col, newSize);
        part(row+newSize, col+newSize, newSize);
        part(row+newSize, col+2*newSize, newSize);

        part(row+2*newSize, col, newSize);
        part(row+2*newSize, col+newSize, newSize);
        part(row+2*newSize, col+2*newSize, newSize);
    }
    public static boolean colorCheck(int row, int col, int size){
        int color=board[row][col];
        for(int i=row;i<row+size;i++){
            for(int j=col;j<col+size;j++){
                if(color!=board[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
