import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer>d=new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a;i++){
            String str=br.readLine();
            String[] s=str.split("_| ");
            switch (s[0]){
                case "push":
                    if(s[1].equals("back")){
                        d.addLast(Integer.parseInt(s[2]));
                    } else{
                        d.addFirst(Integer.parseInt(s[2]));
                    }
                    break;
                case "front":
                    if(!d.isEmpty()){
                        sb.append(d.peekFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }

                    break;

                case "back":
                    if (!d.isEmpty()) {
                        sb.append(d.peekLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;

                case "size":
                    sb.append(d.size()).append("\n");
                    break;

                case "pop":
                    if(s[1].equals("front")){
                        if(!d.isEmpty()){
                            sb.append(d.pollFirst()).append("\n");
                        } else {
                            sb.append(-1).append("\n");
                        }
                    } else {
                        if(!d.isEmpty()){
                            sb.append(d.pollLast()).append("\n");
                        } else {
                            sb.append(-1).append("\n");
                        }
                    }
                    break;

                case "empty":
                    if(!d.isEmpty()){
                        sb.append(0).append("\n");
                    } else {
                        sb.append(1).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}