import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n=Integer.parseInt(st.nextToken());
        HashMap<Integer,Integer> map = new HashMap<>();

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(st.nextToken());
            if(map.get(num)==null) map.put(num, 1);
            else map.put(num, map.get(num)+1);
        }

        int m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
         for(int i=0;i<m;i++){
             int num=Integer.parseInt(st.nextToken());
             if(map.get(num)==null) sb.append(0).append(" ");
             else sb.append(map.get(num)).append(" ");
         }
        System.out.println(sb.toString());
    }
}