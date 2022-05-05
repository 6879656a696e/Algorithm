import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        int a=sc.nextInt();
        for(int i=0; i<a; i++){
            String b=sc.next();
            arr.add(b);
        }

        String result="";
        for( int i=0; i<arr.size(); i++ ){
            int cnt=0;
            int sum=0;

            for( int j=0; j<arr.get(i).length();j++ ){
                if(arr.get(i).charAt(j)=='O'){
                    cnt++;
                } else {
                    cnt=0;
                }
                sum+=cnt;
            }
            result+=sum;
            System.out.println(result);
            result="";
        }
    }
}