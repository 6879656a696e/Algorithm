import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue=new LinkedList<>();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            queue.add(i);
        }
        for(int i=0;i<n-1;i++){
            queue.remove();
            queue.add(queue.poll());
        }
        System.out.println(queue.peek());
    }
}