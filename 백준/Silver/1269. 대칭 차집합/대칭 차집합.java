import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        HashSet<Integer> nArr=new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nArr.add(Integer.parseInt(st.nextToken()));
        }
        HashSet<Integer> mArr=new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            mArr.add(Integer.parseInt(st.nextToken()));
        }

        int result=0;
        for(int na:nArr){
            if(!mArr.contains(na)){
                result+=1;
            }
        }
        for(int ma:mArr){
            if(!nArr.contains(ma)){
                result+=1;
            }
        }
        System.out.println(result);
    }
}