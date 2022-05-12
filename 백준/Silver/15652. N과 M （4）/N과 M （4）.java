import java.util.*;

public class Main{
    public static int n,m;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        arr=new int[n];
        dfs(1,0);
    }
    public static void dfs(int at, int depth){
        if(depth==m){
            for(int ar:arr){
                if(ar!=0) System.out.print(ar+" ");
            }
            System.out.println();
            return;
        }
        for(int i=at;i<=n;i++){
            arr[depth]=i;
            dfs(i, depth+1);
        }
    }
}