import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int h=0;
        int m = b+c;

        if(m>60&&c%60!=0){
            int left=m/60;
            m=m%60;
            h=a+left;
            if(h>=24){
                h=h%24;
            } else {
                h=a+left;
            }
        } else if(m==60){
            m=0;
        }else if(c%60==0){
            int left=m/60;
            h=a+left;
            m=b;
            if(h>=24){
                h=h%24;
            } else {
                h=a+left;
            }
        } else{
            h=a;
        }
        System.out.println(h+" "+m);
    }
}