import java.io.*;
import java.util.*;

public class Main{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, m;
    static int[] nArr;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(br.readLine());
        nArr=new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nArr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nArr);

        m=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) {
            int num = Integer.parseInt(st.nextToken());
            if(binarySearch(num)) System.out.print("1 ");
            else System.out.print("0 ");
        }
        br.close();
    }
    static boolean binarySearch(int num) {
        int left = 0;
        int right = n - 1;
        while(left<=right){
            int mididx=(left+right)/2;
            int mid=nArr[mididx];

            if(num<mid) right=mididx-1;
            else if(num>mid) left=mididx+1;
            else return true;
        }
        return false;
    }
}