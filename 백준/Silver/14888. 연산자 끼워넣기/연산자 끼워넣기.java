import java.util.*;

public class Main{
    public static int max=Integer.MIN_VALUE;
    public static int min=Integer.MAX_VALUE;
    public static int[] operator=new int[4];
    public static int[] num;
    public static int n;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        num=new int[n];

        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++){
            operator[i]=sc.nextInt();
        }
        dfs(num[0],1);
        System.out.println(max);
        System.out.println(min);
    }
    public static void dfs(int nb, int idx){
        if(idx==n){
            max = Math.max(max, nb);
            min = Math.min(min, nb);
            return;
        }
        for( int i=0;i<4;i++ ){
            if(operator[i]>0){
                operator[i]--;
                switch (i){

                    case 0:	dfs(nb + num[idx], idx + 1);	break;
                    case 1:	dfs(nb - num[idx], idx + 1);	break;
                    case 2:	dfs(nb * num[idx], idx + 1);	break;
                    case 3:	dfs(nb / num[idx], idx + 1);	break;
                }
                operator[i]++;
            }
        }
    }
}