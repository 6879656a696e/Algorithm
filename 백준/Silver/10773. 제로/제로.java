import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0){
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        int sum=0;
        for(int s:stack){
            sum+=s;
        }
        System.out.println(sum);
    }
}