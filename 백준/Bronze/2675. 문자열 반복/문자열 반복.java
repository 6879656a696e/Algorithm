import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int c=sc.nextInt();
            String b=sc.next();
            for(int j=0;j<b.length();j++){
                char tmp=b.charAt(j);
                for(int k=0;k<c;k++){
                    System.out.print(tmp);
                }
            }
            System.out.println();
        }
    }
}