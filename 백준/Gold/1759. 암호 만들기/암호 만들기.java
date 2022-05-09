import java.util.*;

public class Main {
    public static char[] code;
    public static int n, c;
    public static char[] s;
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c= sc.nextInt();
         s=new char[c];
        code=new char[n];
        for(int i=0;i<c;i++){
            s[i]= sc.next().charAt(0);
        }
        Arrays.sort(s);
        makeCode(0, 0);
    }
    public static void makeCode(int x, int idx){
        if(idx==n){
            if (isValid()) {
                System.out.println(code);
            }
            return;
        }
        for(int i=x;i<c;i++){
            code[idx]=s[i];
            makeCode(i+1, idx+1);
        }
    }

    public static boolean isValid(){
        int mo=0;
        int ja=0;
        for(char x:code){
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                mo++;
            } else {
                ja++;
            }
        }
        if(mo>=1 && ja>=2){
            return true;
        }
        return false;
    }
}