import java.io.*;
import java.util.*;

public class Main{
    public static int[] histogram;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();

        int n;
        while(true){
            st=new StringTokenizer(br.readLine(), " ");
            n=Integer.parseInt(st.nextToken());

            if(n==0) break;

            histogram=new int[n];
            for(int i=0;i<n;i++){
                histogram[i]=Integer.parseInt(st.nextToken());
            }
            sb.append(getArea(n)).append('\n');
            histogram=null;
        }
        System.out.println(sb);
    }

    public static long getArea(int len){
        Stack<Integer>stack = new Stack<Integer>();
        long maxArea=0;
        for(int i=0;i<len;i++){
            while(!stack.isEmpty() && histogram[stack.peek()] >= histogram[i]){
                int height=histogram[stack.pop()];
                long width=stack.isEmpty() ? i : i-1-stack.peek();
                maxArea=Math.max(maxArea, height*width);
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int height=histogram[stack.pop()];
            long width=stack.isEmpty() ? len:len-1-stack.peek();
            maxArea=Math.max(maxArea, width*height);
        }
        return maxArea;
    }
}