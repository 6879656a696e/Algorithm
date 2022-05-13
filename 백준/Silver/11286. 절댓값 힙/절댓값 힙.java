import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> queue=new PriorityQueue<>((o1, o2) ->
                Math.abs(o1)==Math.abs(o2) ? Integer.compare(o1,o2) : Integer.compare(Math.abs(o1), Math.abs(o2))
        );
        for (int i = 0; i < n; i++) {
            int num= sc.nextInt();
            if(num==0){
                if(!queue.isEmpty()){
                    System.out.println(queue.poll());
                } else {
                    System.out.println(0);
                }
                continue;
            }
            queue.add(num);
        }
    }
}