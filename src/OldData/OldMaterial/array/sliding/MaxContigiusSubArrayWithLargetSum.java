package OldData.OldMaterial.array.sliding;

public class MaxContigiusSubArrayWithLargetSum {
    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        getMaxSubArrayLength(a);
    }
    private static void getMaxSubArrayLength(int nums[]){

        int sum = nums[0];
        int max =nums[0];
        for(int i =1;i< nums.length;i++){
            if(sum < 0){
                sum = nums[i];
            }else{
                sum+= nums[i];
            }
            max = Math.max(sum,max);
        }
        System.out.println("Max length : "+max);

    }
}
