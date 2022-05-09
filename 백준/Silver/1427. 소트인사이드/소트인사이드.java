import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int[] arr = new int[n.length()];
        for(int i=0;i<n.length();i++){
            arr[i]=Character.getNumericValue(n.charAt(i));
        }
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int ar:arr){
            list.add(ar);
        }
        Collections.reverse(list);
        for(int li:list){
            System.out.print(li);
        }
    }
}