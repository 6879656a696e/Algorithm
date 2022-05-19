import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        List<Integer> list = new ArrayList<>();
        list.add(0);

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>list.get(list.size()-1)) list.add(arr[i]);
            else {
                int left =0;
                int right=list.size()-1;
                while(left<right){
                    int mid=(left+right)>>1;
                    if(list.get(mid)>=arr[i]){
                        right=mid;
                    } else {
                        left=mid+1;
                    }
                }
                list.set(right, arr[i]);
            }
        }
        System.out.println(list.size()-1);
    }
}