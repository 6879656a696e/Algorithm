import java.io.*;
import java.util.*;

public class Main{
    final static long p=1000000007;
    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st=new StringTokenizer(br.readLine(), " ");

       long n=Long.parseLong(st.nextToken());
       long k=Long.parseLong(st.nextToken());
       long numer=factorial(n);
       long denom=factorial(k)*factorial(n-k)%p;
        System.out.println(numer*pow(denom,p-2)%p);
    }
    public static long factorial(long n){
        long fac=1L;
        while(n>1){
            fac=(fac*n)%p;
            n--;
        }
        return fac;
    }
    public static long pow(long base, long exp){
        if(exp==1){
            return base%p;
        }
        long tmp=pow(base, exp/2);
        if(exp%2==1){
            return (tmp*tmp%p)*base%p;
        }
        return tmp*tmp%p;
    }
}
