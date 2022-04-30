import java.util.*;
class Solution {
    public String solution(String new_id) {
        String answer = "";
        ArrayList<Character> splitArray=new ArrayList<>();
        ArrayList<Character> array=new ArrayList<>();
        new_id.chars()
                .mapToObj(ch->Character.valueOf((char)ch))
                .map(Character::toLowerCase)
                .filter(c->!( (c<(char)97 || c>(char)122) && (c>(char)95||c<(char)95) && (c<(char)48 || c>57) && (c<(char)45||c>(char)46)))
                .forEach(c->{
                    splitArray.add(c);
                    if(splitArray.get(0).equals('.')){
                        splitArray.remove(c);
                    }
                });



        for (int i=0; i<splitArray.size(); i++) {
            if (i == 0) {
                array.add(splitArray.get(i));
            } else {
                if(splitArray.get(i).equals('.')) {
                    if (splitArray.get(i) != array.get(array.size()-1)) {
                        array.add(splitArray.get(i));
                    }
                } else {
                    array.add(splitArray.get(i));
                }
            }
        }

        if(array.isEmpty() && array.size()<3){
            for(int i=0; i<3; i++){
                array.add('a');
            }
        }

        if(array.size()>15){
            for( int i=array.size()-1; i>=15; i-- ) {
                array.remove(i);
            }
        }
        for(int i=array.size()-1; i>=0;i--){
            if(array.get(array.size()-1).equals(array.get(i))&&array.get(array.size()-1).equals('.')){
                array.remove(array.size()-1);
            }
        }
        if(array.size()<3){
            array.add(array.get(array.size()-1));
            if(array.size()<3){
                array.add(array.get(array.size()-1));
            }
        }

        for(char id : array){
            answer=answer+id;
        }
        return answer;
    }
}