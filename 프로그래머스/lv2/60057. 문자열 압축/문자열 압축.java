import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = s.length();
        for(int i=1; i<=s.length()/2; i++) {
            String subs=s.substring(0,i);
            StringBuilder result=new StringBuilder();
            int cnt=1;
            for(int j = i; j < s.length(); j += i){
                String subComp = s.substring(j, j + i > s.length() ? s.length() : i + j);
                
                if(subs.equals(subComp)){
                    cnt++;
                } else {
                    result.append((cnt !=1 ? cnt : "")+subs);
                    subs=subComp;
                    cnt=1;
                }
            }
            if(cnt != 1) {
                result.append(cnt+subs);
            } else {
                result.append(subs);
            }
            answer=Math.min(answer, result.length());
        }
        return answer;
    }
}