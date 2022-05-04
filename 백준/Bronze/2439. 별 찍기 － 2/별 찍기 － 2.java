import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1; i<=a;i++){
            String temp="";
            for(int j=a-i;j>0; j--){
                temp+=" ";
            }
            for(int k=a-i;k<a;k++){
                temp+="*";
            }
            System.out.println(temp);
        }
    }
}