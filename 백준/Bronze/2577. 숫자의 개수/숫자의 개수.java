import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> arr=new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        String aa=br.readLine();
        int a=Integer.parseInt(aa);
        String bb=br.readLine();
        int b=Integer.parseInt(bb);
        String cc=br.readLine();
        int c=Integer.parseInt(cc);
        String tot=Integer.toString(a*b*c);

        for(int i=0;i<tot.length();i++){
            arr.add(Character.toString(tot.charAt(i)));
        }

        for(int i=0;i<10;i++){
            int count=0;
            for(int j=0;j<arr.size();j++){
                int num=Integer.parseInt(arr.get(j));
                if(i==num){
                    count++;
                }
                map.put(i,count);
            }
        }
        for(Map.Entry<Integer, Integer> entrySet : map.entrySet()){
            System.out.println(entrySet.getValue());
        }
    }
}