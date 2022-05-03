import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char[] aArr=String.valueOf(a).toCharArray();
        char[] bArr=String.valueOf(b).toCharArray();
        int result=0;
        int temp=10;
        for(int i=bArr.length-1;i>=0;i--){
            System.out.println(a*Character.getNumericValue(bArr[i]));
            if(i<=1){
                result+=a*Character.getNumericValue(bArr[i])*temp;
                temp*=10;
            } else {
                result+=a*Character.getNumericValue(bArr[i]);
            }
        }
        System.out.println(result);
    }
}