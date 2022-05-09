import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String a=sc.next();
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)=='('){
                    stack.push(a.charAt(j));
                } else{
                    int size=stack.size();
                    if(size==0){
                        stack.push(a.charAt(j));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}