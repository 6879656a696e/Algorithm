import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int cycle=0;
        int n=a;
        do{
            int b=n/10;
            int c=n%10;
            int sum=b+c;
            if(sum>=10){
                sum=sum%10;
            }
            n=Integer.parseInt(Integer.toString(c)+Integer.toString(sum));
            cycle++;
        }while(n!=a);

        System.out.println(cycle);
    }
}