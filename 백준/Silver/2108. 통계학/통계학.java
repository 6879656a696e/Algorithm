import java.util.*;

public class Main {
    public static int calcAvg(int[] arr){
        Scanner sc=new Scanner(System.in);
        double sum=0;
        for(int ar:arr){
            sum+=ar;
        }
        double result=Math.round(sum/arr.length);
        return (int)result;
    }

    public static int median(int[] arr){
        int result=0;
        for(int i=0;i<arr.length;i++){
            if(arr.length%2==0){
                int idx=(arr.length/2)-1;
                result=arr[idx];
            } else {
                int idx=arr.length/2;
                result=arr[idx];
            }
        }
        return result;
    }

    public static int mode(int[] arr){
        int count=0;
        int[] plus=new int[4001];
        int[]minus=new int[4001];
        int max=0;
        int result=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                plus[arr[i]]++;
            } else {
                minus[Math.abs(arr[i])]++;
            }
        }
        for(int i=0;i< plus.length;i++){
            max=Math.max(max, plus[i]);
        }
        for(int i=0;i< minus.length;i++){
            max=Math.max(max,minus[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr) {
            if(i<0) {
                if(minus[Math.abs(i)] == max && !(list.contains(i))) {
                    list.add(i);
                }
            }
            else {
                if(plus[i] == max && !(list.contains(i))) {
                    list.add(i);
                }
            }
        }

        if(list.size()>=2){
            result=list.get(1);
        } else {
            result=list.get(0);
        }
        return result;
    }

    public static int range(int[] arr){
        int result=0;
        int max=arr[arr.length-1];
        int min=arr[0];
        result=max-min;
        return result;
    }

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(calcAvg(arr));
        System.out.println(median(arr));
        System.out.println(mode(arr));
        System.out.println(range(arr));
    }
}