import java.util.*;

public class Main {
    public static char[][] arr; //*과 공백 넣을 이중배열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        arr=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(arr[i], ' '); //배열을 공백으로 초기화
        }
        factorial(n, 0 ,0);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    static void factorial(int n, int x, int y){
        if(n==1){ //n이 1이면
            arr[x][y]='*'; // *을 채우고 끝냄 
            return;
        }
        int value=n/3; //n(3의 제곱)을 3으로 나눠서 몫을 저장
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==1 && j==1){ //i, j가 1이면 공백 넣음
                    continue;
                } else { //아니라면 재귀호출
                    factorial(value, x+(value*i), y+(value*j));
                }
            }
        }
    }
}