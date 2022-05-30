import java.io.*;
import java.util.*;

public class Main{
    static int n,m;
    static ArrayList<Integer>[] tree;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int t=1;
        while(true){
            StringTokenizer st=new StringTokenizer(br.readLine());
            n=Integer.parseInt(st.nextToken());
            m=Integer.parseInt(st.nextToken());
            if(n==0 && m==0) break;

            int ans=0;
            tree=new ArrayList[n];
            visited=new boolean[n];
            for(int i=0;i<n;i++){
                tree[i]=new ArrayList<>();
            }
            for(int i=0;i<m;i++){
                st=new StringTokenizer(br.readLine());
                int a=Integer.parseInt(st.nextToken())-1;
                int b=Integer.parseInt(st.nextToken())-1;
                tree[a].add(b);
                tree[b].add(a);
            }
            for(int i=0;i<n;i++){
                if(!visited[i]){
                    visited[i]=true;
                    if(dfs(-1, i)) ans++;
                }
            }
            sb.append("Case ").append(t).append(": ");
            if(ans==0){
                sb.append("No trees.\n");
            } else if(ans==1){
                sb.append("There is one tree.\n");
            } else {
                sb.append("A forest of ").append(ans).append(" trees.\n");
            }
            t++;
        }
        System.out.println(sb);
        br.close();
    }
    public static boolean dfs(int root, int num){
        for(int i:tree[num]){
            if(i==root) continue;
            if(visited[i]) return false;
            visited[i]=true;
            if(!dfs(num, i)) return false;
        }
        return true;
    }
}