import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        HashMap<String,Integer> map = new HashMap<>();
        String[] names=new String[n+1];

        for(int i=1;i<=n;i++){
            String name=br.readLine();
            map.put(name, i);
            names[i]=name;
        }

        for(int i=0;i<m;i++){
            String words= br.readLine();
            if(isNum(words)){
                int idx=Integer.parseInt(words);
                sb.append(names[idx]);
            } else {
                sb.append(map.get(words));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static boolean isNum(String words) {
        try{
            Double.parseDouble(words);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}