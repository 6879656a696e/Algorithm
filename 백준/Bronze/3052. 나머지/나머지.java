import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> arr=new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<10;i++){
            arr.add(br.readLine());
        }
        for(int i=0; i<arr.size();i++){
            int num=Integer.parseInt(arr.get(i))%42;
            set.add(num);
        }
        System.out.println(set.size());
    }
}