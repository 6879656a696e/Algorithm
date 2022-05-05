import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        List<ArrayList<Double>> list=new ArrayList<>();

        int a=sc.nextInt();
        double sum=0;


        for(int i=0;i<a;i++) {
            double b = sc.nextInt();
            ArrayList<Double> arr = new ArrayList<>();

            for (int j = 0; j < b; j++) {
                double n = sc.nextInt();
                arr.add(n);
                sum += arr.get(j);
            }

            double avg = sum / b;

            double temp = 0;
            double ratio = 0;
            for (int j = 0; j < b; j++) {
                if (arr.get(j) >avg) {
                    temp+=1;
                    ratio = (temp / b)*100;
                }
            }
            System.out.println(String.format("%.3f", ratio)+"%");
            sum=0;
            avg=0;
        }
    }
}