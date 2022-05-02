import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String ans="";
        ArrayList<String> arr=new ArrayList<>();
        int cnt=0;

        for(int i=0; i<dartResult.length(); i++){
            if(dartResult.charAt(i)>='0' && dartResult.charAt(i)<='9'){
                if(dartResult.charAt(i)=='1'&& dartResult.charAt(i+1)=='0'){
                    int num=10;
                    char c=dartResult.charAt(i+2);
                    if(c=='S'){
                        num=(int)(Math.pow(num,1));
                    } else if(c=='D'){
                        num=(int)(Math.pow(num,2));
                    } else {
                        num=(int)(Math.pow(num,3));
                    }
                    arr.add(Integer.toString(num));
                    i++;
                } else {
                    int num=dartResult.charAt(i)-'0';
                    char c=dartResult.charAt(i+1);
                    if(c=='S'){
                        num=(int)(Math.pow(num,1));
                    } else if(c=='D'){
                        num=(int)(Math.pow(num,2));
                    } else {
                        num=(int)(Math.pow(num,3));
                    }
                    arr.add(Integer.toString(num));
                }
            } else if(dartResult.charAt(i)=='*'){
                arr.add(String.valueOf(dartResult.charAt(i)));
            } else if(dartResult.charAt(i)=='#'){
                arr.add(String.valueOf(dartResult.charAt(i)));
            }
        }

        for(int i=0; i<arr.size(); i++){
            if(i>1&&arr.get(i).equals("*")) { //첫번째가 *이 아닐 때
                int temp = 0;
                temp=Integer.parseInt(arr.get(i-1))*2;
                arr.set(i-1,Integer.toString(temp));
                if(!arr.get(i-2).equals("*") && !arr.get(i-2).equals("#")) {
                    int temp2=0;
                    temp2=Integer.parseInt(arr.get(i-2))*2;
                    System.out.println("arr.get(i-2) 1 : "+arr.get(i-2));
                    arr.set(i-2,Integer.toString(temp2));
                }

                if(arr.get(i-2).equals("*")||arr.get(i-2).equals("#")){
                    int temp2 = 0;
                    temp2=Integer.parseInt(arr.get(i-3))*2;
                    System.out.println("arr.get(i-3) 2 :"+arr.get(i-3));
                    arr.set(i-3,Integer.toString(temp2));
                } else {
                    arr.set(i-1,Integer.toString(temp));
                    System.out.println("arr.get(i-2) 3 :"+arr.get(i-2));
                }

            } else if(i==1&&arr.get(i).equals("*")){ //첫번째가 *일 때
                int temp = 0;
                temp=Integer.parseInt(arr.get(i-1))*2;
                arr.set(i-1,Integer.toString(temp));
                if(i>1&& arr.get(i+2).equals("*")){ //*ㅈㅜㅇㅂㅗㄱ
                    int temp2 = 0;
                    temp2=Integer.parseInt(arr.get(i-1))*4;
                    arr.set(i-1,Integer.toString(temp2));
                }
            } else if(arr.get(i).equals("#")){
                int temp = 0;
                temp=Integer.parseInt(arr.get(i-1))* -1;
                arr.set(i-1,Integer.toString(temp));
            }
        }

        for(int i=0; i<arr.size();i++){
            if(!arr.get(i).equals("#")&&!arr.get(i).equals("*")){
                answer+=Integer.parseInt(arr.get(i));
            }
        }
        return answer;
    }
}