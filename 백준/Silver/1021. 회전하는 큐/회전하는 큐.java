import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque d=new LinkedList<>();
        int n=sc.nextInt(); //큐의 크기
        int m=sc.nextInt(); //뽑아내려는 수
        for(int i=1;i<=n;i++){
            d.add(i);
        }
        int count=0;
        for(int i=0;i<m;i++){
            int num=sc.nextInt();

            while(true) {
                int idx = 0;
                Iterator it = d.iterator();

                while (it.hasNext()) {
                    if (it.next().equals(num)) {
                        break;
                    }
                    idx++;
                }
                if (idx == 0) {
                    d.pollFirst();
                    break;
                } else if(idx>d.size()/2){
                    d.addFirst(d.removeLast());
                    count++;
                } else {
                    d.addLast(d.removeFirst());
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}