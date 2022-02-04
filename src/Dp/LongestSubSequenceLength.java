package Dp;
//https://www.youtube.com/watch?v=odrfUCS9sQk
public class LongestSubSequenceLength {
    public static void main(String[] args) {
        int a[]={10,9,2,5,3,7,101,18};

        int dp[]= new int[a.length];
        int finalMax=0;
        for(int i=0;i<a.length;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(a[j]< a[i]){
                    if(dp[j]>max){
                        max = dp[j];
                    }
                }
            }
            dp[i]= max+1;
            if(finalMax< dp[i]){
                finalMax = dp[i];
            }
        }
        System.out.println("Final output: "+finalMax);
    }
}
