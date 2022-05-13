import java.util.*;

public class Main{
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c= sc.nextInt();
        arr=new int[n];
        for( int i=0;i<n;i++ ){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int lo=1;
        int hi=arr[n-1]-arr[0]+1;

        while(lo<hi){
            int mid=(lo+hi)/2;
            if(canInstall(mid)<c){
                hi=mid;
            } else {
                lo=mid+1;
            }
        }
        System.out.println(lo-1);
    }
    public static int canInstall(int distance){
        int cnt=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            int locate=arr[i];
            if(locate-last>=distance){
                cnt++;
                last=locate;
            }
        }
        return cnt;
    }
}