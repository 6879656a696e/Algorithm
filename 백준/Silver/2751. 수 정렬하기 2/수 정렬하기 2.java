import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        int a=Integer.parseInt(br.readLine());
        int[]arr=new int[a];

        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int ar:arr){
            sb.append(ar).append('\n');
        }
        System.out.println(sb);
    }
}