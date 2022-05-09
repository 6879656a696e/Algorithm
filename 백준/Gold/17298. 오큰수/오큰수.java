import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&arr[stack.peek()]<arr[i]){
                arr[stack.pop()]=arr[i];
            }
            stack.push(i);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            arr[stack.pop()]=-1;
        }
        for(int i:arr){
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}