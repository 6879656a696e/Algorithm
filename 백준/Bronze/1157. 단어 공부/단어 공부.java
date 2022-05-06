import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        s=s.toUpperCase();
        int[] arr=new int[26];
        int max=-1;
        char c='?';

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-65]++;
            if(max<arr[s.charAt(i)-65]){
                max=arr[s.charAt(i)-65];
                c=s.charAt(i);
            } else if(max==arr[s.charAt(i)-65]) {
                c='?';
            }
        }
        System.out.println(c);
    }
}