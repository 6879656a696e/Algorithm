import java.io.*;
import java.util.*;

public class Main{
    final static int MOD = 1000;
    public static int n;
    public static int[][] origin;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        long b=sc.nextLong();

        origin=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                origin[i][j]=sc.nextInt()%MOD;
            }
        }

        int[][] result=pow(origin, b);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sb.append(result[i][j]).append(' ');
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static int[][] pow(int[][] a, long exp){
        if(exp==1L){
            return a;
        }
        int[][] ret=pow(a, exp/2);
        ret=multiply(ret, ret);

        if(exp%2==1L){
            ret=multiply(ret, origin);
        }
        return ret;
    }
    public static int[][] multiply(int[][]o1, int[][] o2){
        int[][] ret= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    ret[i][j]+=o1[i][k]*o2[k][j];
                    ret[i][j]%=MOD;
                }
            }
        }
        return ret;
    }
}