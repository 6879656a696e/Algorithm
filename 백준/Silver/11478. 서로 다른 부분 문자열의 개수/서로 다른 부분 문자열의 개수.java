import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s=br.readLine();
        HashSet<String>set = new HashSet<>();

        String name="";
        for(int i=0;i<s.length();i++){
            name="";
                for(int j=i;j<s.length();j++){
                    name+=s.substring(j, j+1);
                    set.add(name);
                }
        }
        System.out.println(set.size());
    }
}