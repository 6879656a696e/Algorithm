import java.io.*;
import java.util.*;

public class Main{
    public static int[] arr;
    public static int n,m;
    public static boolean[] visit;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();

        arr=new int[n];
        visit = new boolean[n];
        dfs(0);
    }
    public static void dfs(int depth){
        if(depth==m){
            for(int ar:arr){
                if(ar!=0) System.out.print(ar+" ");
            }
            System.out.println();
            return;
        }
        for(int i=0;i<n;i++){
            if(!visit[i]){
                visit[i]=true;
                arr[depth]=i+1;
                dfs(depth+1);
                visit[i]=false;
            }
        }
    }
}