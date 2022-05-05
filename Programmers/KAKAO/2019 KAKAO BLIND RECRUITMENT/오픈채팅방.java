import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        List<String> result=new LinkedList<>();
        HashMap<String, String> map=new HashMap<>();
        for(int i=0;i<record.length;i++){
            if(!record[i].split(" ")[0].equals("Leave")){
                map.put(record[i].split(" ")[1],record[i].split(" ")[2]);
            }
        }
        for(int i=0;i<record.length;i++){
            String userid=record[i].split(" ")[1];
            String nickname=map.get(record[i].split(" ")[1]);
            if(record[i].split(" ")[0].equals("Enter")&&record[i].split(" ")[1].equals(userid)){
                result.add(nickname+"님이 들어왔습니다.");
            } else if(record[i].split(" ")[0].equals("Leave")&&record[i].split(" ")[1].equals(userid)){
                result.add(nickname+"님이 나갔습니다.");
            }
        }

        String[] answer=result.toArray(new String[result.size()]);
        return answer;
    }
}