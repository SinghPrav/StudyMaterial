package OldMaterial.Dp;

public class SumSubset {
    static boolean isSubsetSum(int set[],
                               int n, int sum)
    {
        // The value of subset[i][j] will be
        // true if there is a subset of
        // set[0..j-1] with sum equal to i
        boolean subset[][] = new boolean[n + 1][sum + 1];

        // If sum is 0, then answer is true
        for (int i = 0; i < n+1; i++)
            subset[i][0] = true;

        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i < sum+1; i++)
            subset[0][i] = false;

        for(int i=1;i< n+1; i++){
            for(int j=1; j< sum+1; j++){
                if(set[i-1] <= j){
                    subset[i][j] = subset[i][j-set[i-1]] || subset[i-1][j];
                }else {
                    subset[i][j] =  subset[i-1][j];
                }
            }
        }
        return subset[n][sum];
    }

    /* Driver code*/
    public static void main(String args[])
    {
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");
    }
}
