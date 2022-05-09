import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int  n=0;
        int cnt=0;
        while(true){
            n++;
            cnt+=n;
            if(cnt>=a){
                if(n%2==0){
                    System.out.println(a-cnt+n+"/"+(cnt-a+1));
                } else {
                    System.out.println((cnt-a+1)+"/"+(a-cnt+n));
                }
                break;
            }
        }
    }
}