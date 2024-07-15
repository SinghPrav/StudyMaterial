package OldData.OldMaterial.Dp;

public class FrogJumWithMaxDistance {
    public static void main(String[] args) {
        int a []= {2,6,8,5};
        System.out.println(solution(a));
    }
    public static int solution(int[] blocks) {


        int n= blocks.length;
        if(n==0){
            return 0;
        }

        int i=0;
        int   curPeakIndex = i+1;
        int prevPeakIndex = i;
        int repeatPeaks = 0;
        int maxDist =0;
        boolean jump = false;

        for(;i<n-1;i++){
            if(blocks[i+1]>= blocks[i]){
                curPeakIndex = i+1;
                if(blocks[i+1]== blocks[i]){
                    ++ repeatPeaks;
                }else{
                    jump = true;
                    if(repeatPeaks >0){
                        repeatPeaks = 0;
                    }
                }
            }else{
                if(jump){
                    prevPeakIndex = curPeakIndex-repeatPeaks;
                    jump = false;
                    repeatPeaks =0;
                }
                curPeakIndex =i+1;
            }
            if(maxDist<= (curPeakIndex-prevPeakIndex+1)){
                maxDist = curPeakIndex-prevPeakIndex+1;
            }

        }
        return maxDist;
    }
}
