import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> box=new ArrayList<>();
            for(int k=0; k<moves.length;k++){
                for(int j=0; j<board.length;j++){
                 if(board[j][moves[k]-1]!=0){
                     box.add(board[j][moves[k]-1]);
                     board[j][moves[k]-1]=0;
                     break;
                 }
                }
        }
        Collections.reverse(box);
         for(int i=0;i<box.size()-1;i++){
             for(int j=i+1;j<box.size();j++){
                 if(box.get(i)==box.get(j)){
                     answer+=2;
                     box.remove(i);
                     box.remove(i);
                     i=-1;
                     break;
                 } else{
                i=j;
                }
             }
         }
        return answer;
    }
}