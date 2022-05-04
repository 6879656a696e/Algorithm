import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        List<Double> arr=new ArrayList<>();

        int a=sc.nextInt();

        for(int i=0;i<a;i++){
            double n=sc.nextInt();
            arr.add(n);
        }
        double max=Collections.max(arr);

        double sum=0;
        double temp=0;
        for(int i=0;i<arr.size();i++){
            temp=(arr.get(i)/max)*100;
            arr.set(i, temp);
            sum+=arr.get(i);
        }
        double avg=sum/arr.size();
        System.out.println(avg);
    }
}