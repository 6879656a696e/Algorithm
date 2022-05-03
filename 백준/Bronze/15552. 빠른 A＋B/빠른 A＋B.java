import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int num=Integer.parseInt(br.readLine());

        for(int i=1;i<=num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1=Integer.parseInt(st.nextToken());
            int n2=Integer.parseInt(st.nextToken());
            String sum=Integer.toString(n1+n2);
            bw.write(sum+"\n");
        }
        bw.flush();
    }
}