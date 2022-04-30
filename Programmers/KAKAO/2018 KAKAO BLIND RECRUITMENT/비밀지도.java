class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String binary;
        int num=0;
        for(int i=0; i<arr1.length; i++){
            num=arr1[i]|arr2[i];
            binary=String.format("%"+n+"s",Integer.toBinaryString(num)).replace(" ","0");
            binary=binary.replaceAll("0", " ");
            binary=binary.replaceAll("1", "#");
            answer[i]=binary;
        }
        System.out.println();
        return answer;
    }
}