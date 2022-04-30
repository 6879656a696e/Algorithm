class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] arr = new int[4][3];
        int k=1;
        int[] hleft=new int[]{3,0};
        int[] hright=new int[]{3,2};

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j]=k;
                k+=1;
                if(i==3 && j==1) {
                    k+=11;
                }
                if(k==11) {
                    k=0;
                }
            }
        }
        for(int o=0; o<numbers.length; o++){
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++) {
                    if(numbers[o]==arr[i][j]) {
                        if(numbers[o]==arr[i][0]) {
                            answer+="L";
                            hleft[0]=i;
                            hleft[1]=j;
                        } else if(numbers[o]==arr[i][1] && hand.equals("right")) {
                            if((Math.abs(i-hleft[0])+Math.abs(j-hleft[1])) > (Math.abs(i-hright[0])+Math.abs(j-hright[1]))) {
                                answer+="R";
                                hright[0]=i;
                                hright[1]=j;
                            } else if((Math.abs(i-hleft[0])+Math.abs(j-hleft[1])) == (Math.abs(i-hright[0])+Math.abs(j-hright[1]))){

                                answer+="R";
                                hright[0]=i;
                                hright[1]=j;
                            } else {
                                answer+="L";

                                hleft[0]=i;
                                hleft[1]=j;
                            }

                        } else if(numbers[o]==arr[i][1] && hand.equals("left")){
                            if((Math.abs(i-hleft[0])+Math.abs(j-hleft[1])) > (Math.abs(i-hright[0])+Math.abs(j-hright[1]))) {
                                answer+="R";
                                hright[0]=i;
                                hright[1]=j;
                            } else if((Math.abs(i-hleft[0])+Math.abs(j-hleft[1])) == (Math.abs(i-hright[0])+Math.abs(j-hright[1]))){
                                answer+="L";
                                hleft[0]=i;
                                hleft[1]=j;
                            } else {
                                answer+="L";
                                hleft[0]=i;
                                hleft[1]=j;
                            }
                        } else if(numbers[o]==arr[i][2]) {
                            answer+="R";
                            hright[0]=i;
                            hright[1]=j;
                        }
                    }

                }
            }
        }
        return answer;
    }
}