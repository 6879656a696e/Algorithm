import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int num=a;

        if(a==b && b==c &&c==a){
            System.out.println(10000+a*1000);
        } else if (a!=b&&b!=c&&c!=a) {
            if(a>b&&a>c){
                System.out.println(a*100);
            } else if (b>c&&b>a){
                System.out.println(b*100);
            } else {
                System.out.println(c*100);
            }
        } else if(a==b||b==c||c==a){
            if(a==b){
                num=b;
            } else if( b==c){
                num=c;
            } else {
                num=a;
            }
            System.out.println(1000+num*100);
        }
    }
}