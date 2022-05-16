import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        List<Integer> list[] = new ArrayList[n+1];
        for(int i=0;i<list.length;i++){
            list[i]= new ArrayList<Integer>();
        }
        for(int i=0;i<n-1;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        boolean visit[]=new boolean[n+1];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        visit[1]=true;
        int ans[]=new int[n+1];
        while(!queue.isEmpty()){
            Integer num=queue.poll();
            for(Integer i:list[num]){
                if(!visit[i]){
                    visit[i]=true;
                    ans[i]=num;
                    queue.add(i);
                }
            }
        }
        for(int i=2;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}