import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer, Integer> map=new HashMap<>();
        LinkedList<Integer> linkedList=new LinkedList<>();
        int n=sc.nextInt();
        int cnt=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int ar:arr){
            linkedList.add(ar);
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], cnt);
                cnt++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int li:linkedList){
            sb.append(map.get(li)).append(" ");
        }

        System.out.println(sb);
    }
}