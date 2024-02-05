package OldMaterial.Dp;

public class LongestCommonSubString {
    public static void main(String[] args) {
        String str1 ="GeeksforGeeks";
        String str2 ="GeeksQuiz";

        int dp[][]= new int[str1.length()+1][str2.length()+1];

        int max = 0;

        for(int i=1;i< dp.length;i++){
            for(int j=1;j< dp[0].length;j++){
                char a = str1.charAt(i-1);
                char b = str2.charAt(j-1);

                if(a!=b){
                    dp[i][j]=0;
                }else {
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                if(dp[i][j] > max){
                    max = dp[i][j];
                }
            }

        }
        System.out.println("Longest substring: "+max);
    }
}
