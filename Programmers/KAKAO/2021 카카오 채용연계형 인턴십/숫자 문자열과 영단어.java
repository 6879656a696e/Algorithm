import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        ArrayList<String> eng = new ArrayList<>(Arrays.asList("zero","one","two","three","four","five","six","seven","eight","nine"));
        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<10; i++){
            String str=String.valueOf(i);
            map.put(str,eng.get(i));
        }


        for(int i=0; i<eng.size();i++){
            if(s.contains(eng.get(i))){
                for(Map.Entry<String, String> entry: map.entrySet()){
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if(eng.get(i)==value) {
                        s=s.replaceAll(eng.get(i), key);
                    }
                }
            }
        }

        answer=Integer.parseInt(s);

        return answer;
    }
}