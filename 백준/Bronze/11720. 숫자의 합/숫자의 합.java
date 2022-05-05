import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
            int a=sc.nextInt();
            int sum=0;
            String s=sc.next();
            if(s.length()==a){
                for(int i=0;i<s.length();i++){
                    int c = s.charAt(i)-'0';
                    arr.add(c);
                }
                for(int i=0; i<arr.size();i++){
                    sum+=arr.get(i);
                }
            }
            System.out.println(sum);
            sum=0;
    }
}