import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int h=0;
        int m=0;
        if(b<45){
            if(m==60){
                m=0;
            } else {
                m=((60+b)-45);
            }
            if(a==0) {
                h=24-1;
            } else{
                h=a-1;
            }
        } else {
            h=a;
            m=b-45;
        }
        System.out.println(h+" "+m);
    }
}