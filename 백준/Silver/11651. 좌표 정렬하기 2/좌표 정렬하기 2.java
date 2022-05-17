import java.util.*;

public class Main{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
                arr[i][1]=sc.nextInt();
                arr[i][0]=sc.nextInt();
        }
        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            }
            else{
                return Integer.compare(o1[0],o2[0]);
            }
        });

        for(int i=0;i<n;i++){
            System.out.println(arr[i][1]+" "+arr[i][0]);
        }
    }
}