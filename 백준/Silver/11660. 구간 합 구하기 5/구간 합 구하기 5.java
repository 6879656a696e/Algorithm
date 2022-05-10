import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] table = new int[n+1][n+1];
        int[][] dp=new int[n+1][n+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                table[i][j]=sc.nextInt();
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1; j<=n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1]+table[i][j];
            }
        }
        int x1, y1, x2, y2;
        StringBuilder sb = new StringBuilder();
        for(int mm=0;mm<m;mm++){
            x1=sc.nextInt();
            y1=sc.nextInt();
            x2=sc.nextInt();
            y2=sc.nextInt();
            sb.append(dp[x2][y2]-dp[x2][y1-1]-dp[x1-1][y2]+dp[x1-1][y1-1]).append("\n");
        }
        System.out.println(sb);
    }
}