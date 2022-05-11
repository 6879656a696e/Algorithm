import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sb.append((int)(Math.pow(2,n)-1)).append("\n");
        Hanoi(n,1,2,3);
        System.out.println(sb);
    }
    public static void Hanoi(int n, int a, int b, int c){
        if(n==1){
            sb.append(a+" "+c+"\n");
            return;
        }
        Hanoi(n-1,a,c,b); //n-1개를 a->b
        sb.append(a+" "+c+"\n"); //남은 n 한개를 a->c
        Hanoi(n-1,b,a,c); //n-1개를 b->c로
    }
}