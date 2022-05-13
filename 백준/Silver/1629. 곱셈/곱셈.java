import java.util.*;

public class Main{
    public static long c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        c=sc.nextLong();
        System.out.println(pow(a,b));
    }
    public static long pow(long a, long exp){
        if(exp==1){
            return a%c;
        }

        long tmp=pow(a, exp/2);

        if(exp%2==1){
            return (tmp*tmp%c)*a%c;
        }
        return tmp*tmp%c;
    }
}