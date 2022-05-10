import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(a-->0){
            String op=br.readLine();
            int n=Integer.parseInt(br.readLine());
            String[] arr = br.readLine().replace("[","").replace("]","").split(",");
            sb.append(acFunction(op, n, arr));
            if(a!=0) sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    static String acFunction(String op, int n, String[] arr){
        Deque<Integer>d=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            d.offer(Integer.parseInt(arr[i]));
        }

        boolean dir=true;

        for(int i=0;i<op.length();i++){
            char type=op.charAt(i);
            if(type=='R'){
                dir=!dir;
            }else{
                if(d.isEmpty()){
                    return "error";
                }
                if(dir){
                    d.pollFirst();
                } else {
                    d.pollLast();
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        while(!d.isEmpty()){
            if(dir){
                sb.append(d.poll());
            } else {
                sb.append(d.pollLast());
            }
            if(!d.isEmpty()) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}