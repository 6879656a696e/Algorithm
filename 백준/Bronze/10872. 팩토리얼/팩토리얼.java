import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int pac=1;
        while(n!=0){
            pac=pac*n;
            n--;
        }
        System.out.println(pac);
    }
}