import java.util.*;

public class Main{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
                arr[i]=sc.next();
        }
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                } else {
                    return o1.length()-o2.length();
                }
            }
        });

        System.out.println(arr[0]);

        for(int i=1;i<n;i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }
}