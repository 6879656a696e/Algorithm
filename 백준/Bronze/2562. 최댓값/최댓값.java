import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr=new ArrayList<>();
        for(int i=0; i<9;i++){
            String aa=br.readLine();
            int a=Integer.parseInt(aa);
            arr.add(a);
        }
        int max=Collections.max(arr);
        int idx=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==max){
                idx=i;
            }
        }
        System.out.println(max);
        System.out.println(idx+1);
    }
}