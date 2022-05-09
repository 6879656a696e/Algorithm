import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int[] arr=new int[n+1];
        int m=1;
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        StringBuffer sb = new StringBuffer();
       for(int i=1;i<=n;i++){
           stack.push(i);
           sb.append("+").append("\n");
           while(!stack.empty()&&stack.peek()==arr[m]){
               stack.pop();
               sb.append("-").append("\n");
               m++;
           }
       }
       if(stack.empty()){
           System.out.println(sb);
       } else {
           System.out.println("NO");
       }
    }
}