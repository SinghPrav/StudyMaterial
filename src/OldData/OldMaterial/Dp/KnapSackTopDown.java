package OldData.OldMaterial.Dp;

public class KnapSackTopDown {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };

        int W = 50;
        int N = val.length;

        int t[][]= new int[N+1][W+1];

        for(int i = 0; i < N + 1; i++)
            for(int j = 0; j < W + 1; j++)
                if(i==0 || j==0)
                t[i][j] = 0;

        for(int i=1;i< N+1; i++){
            for(int j=1; j< W+1; j++){
                if(wt[i-1] <= j){
                    t[i][j] = Math.max(val[i-1]+ t[i-1][j-wt[i-1]], t[i][j]);
                }else {
                    t[i][j] =  t[i][j];
                }
            }
        }
        System.out.println(t[N][W]);
    }

}
