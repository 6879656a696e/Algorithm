import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<a;i++){
            arr.add(sc.nextInt());
        }
        int max=arr.isEmpty() ? -1 : Collections.max(arr);
        int min=arr.isEmpty() ? -1 : Collections.min(arr);
        System.out.println(min+" "+max);
    }
}