import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue=new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=1;i<=n;i++){
            queue.add(i);
        }

        for(int i=1;i<=n*k;i++){
            if(i%k==0){
                list.add(queue.poll());
            } else {
                queue.add(queue.poll());
            }
        }

        System.out.print("<");
        for(int i=0;i<list.size();i++){
            if(i!=list.size()-1){
                System.out.print(list.get(i)+", ");
            } else {
                System.out.print(list.get(i));
            }
        }
        System.out.print(">");
    }
}