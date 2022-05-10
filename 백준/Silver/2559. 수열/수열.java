import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] nArr=new int[n];
        int result=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            nArr[i]=sc.nextInt();
        }
        for(int i=0;i<=n-m;i++){
            int sum=0;
            for(int j=i;j<i+m;j++){
                sum+=nArr[j];
            }
            result=Math.max(result, sum);
        }
        System.out.println(result);
    }
}