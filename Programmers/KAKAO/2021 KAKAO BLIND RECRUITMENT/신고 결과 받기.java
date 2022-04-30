import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        HashMap<String, Integer> mailBox = new HashMap<>();
        HashMap<String, HashSet<String>> reportList=new HashMap<>();
        for(String id : id_list){
            mailBox.put(id, 0);
            reportList.put(id,new HashSet<>());
        }

        for(String rp : report){
            String[] findReporter=rp.split(" ");
            reportList.get(findReporter[1]).add(findReporter[0]);
        }

        for(String key : reportList.keySet()){
            HashSet<String> reporters=reportList.get(key);
            if(reporters.size()>=k){
                for(String reporter:reporters){
                    Integer getMail=mailBox.get(reporter);
                    mailBox.put(reporter, getMail+1);
                }
            }
        }

        int[] answer = new int[id_list.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = mailBox.get(id_list[i]);
        }
        return answer;
    }
}