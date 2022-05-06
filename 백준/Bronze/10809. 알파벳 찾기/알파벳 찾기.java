import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String a=sc.next();
        for(int i=0; i<arr.length; i++) {
            arr[i]=-1;
        }
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            int temp=(int)c;

            temp-=97;
            if(arr[temp]==-1){
                arr[temp]=i;
            }
        }
        for(int ar:arr){
            System.out.print(ar+" ");
        }
    }
}
