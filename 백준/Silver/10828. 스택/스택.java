import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int a=sc.nextInt();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<=a;i++){
            String cmd=sc.nextLine();
            if(cmd.contains("push")){
                int num=Integer.parseInt(cmd.substring(5,cmd.length()));
                stack.push(num);
            } else if(cmd.contains("top")){
                if(stack.isEmpty()){
                   sb.append("-1").append("\n");
                } else {
                    sb.append(stack.peek()).append("\n");
                }
            } else if(cmd.contains("pop")) {
                if(stack.isEmpty()){
                    sb.append("-1").append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            } else if(cmd.contains("size")){
                sb.append(stack.size()).append("\n");
            } else if(cmd.contains("empty")){
                if(stack.isEmpty()){
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}