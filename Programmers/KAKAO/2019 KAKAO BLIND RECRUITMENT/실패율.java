import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int cnt=0;
        ArrayList<Integer> stage=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        HashMap<Integer, Float> map2=new HashMap<>();

        for(int s: stages){
            stage.add(s);
        }


        for(int i=1;i<=N+1;i++){
            if(stage.contains(i)){
                cnt=Collections.frequency(stage,i);
            } else {
                cnt=0;
            }
            map.put(i, cnt);
        }

        int temp=0;
        int total=stage.size();

        Iterator<Integer> iter=map.keySet().iterator();
        while(iter.hasNext()){
            int key=iter.next();
            int val=map.get(key);
            temp=temp+val;
            if(key<=N && !(val==0 && total== 0) && !(val==0 && N==key)){ //성공 스테이지 제외
                map2.put(key, (float)val/total);
            }
            if((key<=N && val==0 && N==key)||(key<=N && val==0 && total== 0)) { //성공 스테이지에서 아무도 없을 때
                map2.put(key, (float)0);
            }
            total=stage.size()-temp;
        }

        List<Map.Entry<Integer,Float>> entryList = new LinkedList<>(map2.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for(Map.Entry<Integer,Float> entry:entryList){
            result.add(entry.getKey());
        }

        int[] answer=new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i]=result.get(i);
        }

        return answer;
    }
}