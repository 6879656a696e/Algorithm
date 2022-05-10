import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] nArr=new int[n+1];
        for(int i=1;i<=n;i++){
            nArr[i]=nArr[i-1]+sc.nextInt();
        }
        for(int k=0;k<m;k++){
            int i=0;
            int j=0;
            i=sc.nextInt();
            j=sc.nextInt();
            System.out.println(nArr[j]-nArr[i-1]);
        }
    }
}