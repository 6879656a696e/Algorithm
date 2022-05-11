import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n=Integer.parseInt(st.nextToken());
        HashSet<String> nArr=new HashSet<>();
        for(int i=0;i<n;i++){
            nArr.add(br.readLine());
        }
        int m=Integer.parseInt(st.nextToken());
        List<String> mArr=new ArrayList<>();
        for(int i=0;i<m;i++){
            String temp=br.readLine();
            if(nArr.contains(temp)) mArr.add(temp);
        }

        Collections.sort(mArr);

        System.out.println(mArr.size());
        for(String na:mArr){
            System.out.println(na);
        }
    }
}