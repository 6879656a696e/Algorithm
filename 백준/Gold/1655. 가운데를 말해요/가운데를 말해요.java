import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min=new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num= Integer.parseInt(br.readLine());
            if(max.size()==min.size()){
                max.add(num);

                if(!min.isEmpty() && max.peek()>min.peek()) {
                    min.add(max.poll());
                    max.add(min.poll());
                }
            } else {
                min.add(num);
                if(max.peek()>min.peek()){
                    min.add(max.poll());
                    max.add(min.poll());
                }
            }
            sb.append(max.peek()).append("\n");
        }
        System.out.println(sb);
    }
}